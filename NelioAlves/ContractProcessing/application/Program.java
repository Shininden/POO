package POO.NelioAlves.ContractProcessing.application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import POO.NelioAlves.ContractProcessing.entities.Contract;
import POO.NelioAlves.ContractProcessing.entities.Installment;
import POO.NelioAlves.ContractProcessing.services.ContractService;
import POO.NelioAlves.ContractProcessing.services.PayPalService;

public class Program 
{
    public static void main(String[] args) throws ParseException 
    {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data: ");

        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.next(), fmt);

        System.out.print("Contract's total value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(contractDate, totalValue);
        
        
        System.out.print("In how many installments? ");
        int installments = sc.nextInt();

        ContractService service = new ContractService(new PayPalService());
        service.processContract(contract, installments);
        
        System.out.println("\nInstallments:");
        for (Installment inst : contract.getInstallments()) {
            System.out.println(inst);
        }


        sc.close();
    }
}