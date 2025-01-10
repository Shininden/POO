package POO.NelioAlves.ContractProcessing.services;
import java.time.LocalDate;

import POO.NelioAlves.ContractProcessing.entities.Contract;
import POO.NelioAlves.ContractProcessing.entities.Installment;

public class ContractService 
{
    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months)
    {
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) 
        {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = paymentService.calculateInterest(basicQuota, i);
            double installmentValue = paymentService.totalValue(basicQuota + interest);

            contract.getInstallments().add( new Installment(dueDate, installmentValue));
        }
    }

    public OnlinePaymentService getPaymentService() {
        return paymentService;
    }
    public void setPaymentService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }
}