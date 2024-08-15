package POO.Guanabara.Aula10;

public class Main 
{
    public static void main(String[] args) 
    {
        Person p1 = new Person();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();    

        p1.setName("Pedro");
        p2.setName("Maria");
        p3.setName("Claudio");
        p4.setName("Fabina");

        p2.getOlder(12);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}