package POO.NelioAlves.TaxPayment;

public class PJ extends Pessoa
{
    int employees;


    public PJ(int employees) {
        this.employees = employees;
    }

    public PJ(String name, double annualRevenue, int employees) {
        super(name, annualRevenue);
        this.employees = employees;
    }


    @Override
    public double calculateTax() 
    {
        double tax;

        if(getEmployees() < 10){
            tax = getAnnualRevenue() * 0.16;
        }
        else{
            tax = getAnnualRevenue() * 0.14;
        }

        return tax;
    }


    public int getEmployees() {
        return employees;
    }
    public void setEmployees(int employees) {
        this.employees = employees;
    }
}