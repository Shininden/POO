package POO.Guanabara.Aula11;

public class Principal 
{
    public static void main(String[] args) 
    {
        Visitante v1 = new Visitante();
        Estudante s1 = new Estudante();
        Bolsista b1 = new Bolsista();

        v1.setName("Juvenal");
        System.out.println(v1.toString());

        s1.setName("Claudio");
        s1.pagarMensalidade();

        b1.setCourse("1112");
        b1.setName("Jubileu");
        b1.setBolsa(12.5);
        b1.pagarMensalidade();
    }
}