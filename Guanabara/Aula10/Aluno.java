package POO.Guanabara.Aula10;

public class Aluno extends Person
{
    private int matricula;
    private String course;


    public void cancelMatr()
    {
        System.out.println("Matrícula cancelada");
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}