package POO.NelioAlves.TaxPayment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();
        double sum = 0;

        sc.nextLine();
        

        for (int i = 1; i <= taxPayers; i++) 
        {
            System.out.println();
            System.out.println("Tax payer #" + i + " data:");
            
            System.out.print("Individual or company (i/c)? ");
            String type = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double income = sc.nextDouble();

            sc.nextLine();

            if(type.equals("i"))
            {
                System.out.print("Health expenditures: ");
                double costs = sc.nextDouble();
                sc.nextLine();

                pessoas.add(new PF(name, income, costs));
            }
            else
            {
                System.out.print("Number of employees: ");
                int employeesNum = sc.nextInt();
                sc.nextLine();

                pessoas.add(new PJ(name, income, employeesNum));
            }
        }

        System.out.println();

		System.out.println("TAXES PAID:");

		for (Pessoa p : pessoas) {
			System.out.println( p.getName() + ": $ " + String.format("%.2f", p.calculateTax()) );
		}
		
		System.out.println();

		
		for (Pessoa p : pessoas) {
			sum += p.calculateTax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}