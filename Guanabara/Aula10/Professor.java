package POO.Guanabara.Aula10;

public class Professor extends Person
{
    private String speciality;
    private double salary;


    public void getRaise(double raise)
    {
        setSalary(raise);
    }

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double raise) {
        this.salary += raise;
    }
}
