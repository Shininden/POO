package POO.NelioAlves.TaxPayment;

public class PF extends Pessoa
{
    double healthCosts;

    public PF(double healthCosts) {
        this.healthCosts = healthCosts;
    }

    public PF(String name, double annualRevenue, double healthCosts) 
    {
        super(name, annualRevenue);
        this.healthCosts = healthCosts;
    }


    @Override
    public double calculateTax() 
    {
        double tax;

        if(getAnnualRevenue() < 2000){
           tax = getAnnualRevenue() * 0.15;
        }
        else{
            tax = getAnnualRevenue() * 0.25;
        }

        if(getHealthCosts() > 0){
            tax -= getHealthCosts() / 2 ;
        }
        
        if(tax < 0){
            tax = 0;
        }

        return tax;
    }


    public double getHealthCosts() {
        return healthCosts;
    }
    public void setHealthCosts(double healthCosts) {
        this.healthCosts = healthCosts;
    }
}