package POO.NelioAlves.TaxPayment;

public abstract class Pessoa 
{
    String name;
    double annualRevenue;
    double taxesValue;
    
    public Pessoa() {}

    public Pessoa(String name, double annualRevenue) 
    {
        this.name = name;
        this.annualRevenue = annualRevenue;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualRevenue() {
        return annualRevenue;
    }
    public void setAnnualRevenue(double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public abstract double calculateTax();
}