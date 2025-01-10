package POO.NelioAlves.ContractProcessing.services;

public class PayPalService implements OnlinePaymentService
{
    @Override
    public double calculateInterest(double amount, int currMonth) {
        return  amount * 0.01 * currMonth;
    }
    
    @Override
    public double totalValue(double amount) {
        return amount * 1.02;
    }
}