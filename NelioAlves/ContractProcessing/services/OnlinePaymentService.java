package POO.NelioAlves.ContractProcessing.services;

public interface OnlinePaymentService 
{
    double totalValue(double amount);
    double calculateInterest(double amount, int months);
}