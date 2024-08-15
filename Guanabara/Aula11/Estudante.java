package POO.Guanabara.Aula11;

public class Estudante extends Ningen
{
    private int matricula;
    private String course;

    public void pagarMensalidade()
    {
        System.out.println(getName() + ": EU JÁ paguei, eu já paguei");
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