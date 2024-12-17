package POO.NelioAlves.Funcionarios;

public class Employee
{
    private String name;
    private int hours;
    private double valuePerHour;

    public Employee() {}

    public Employee(String name, int hours, double valuePerHour)
    {
        this.setName(name);
        this.setHours(hours);
        this.setValuePerHour(valuePerHour);
    }

    public double payment() {
        return getHours() * getValuePerHour();
     }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " - $");
        sb.append(payment());

        return sb.toString();
    }
}