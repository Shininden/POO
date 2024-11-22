package POO.Guanabara.Aula12;

public class ClassePrincipal 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("unused")
        Mamifero m = new Mamifero();
        @SuppressWarnings("unused")
        Reptil r = new Reptil();
        @SuppressWarnings("unused")
        Peixe p = new Peixe();
        @SuppressWarnings("unused")
        Ave a = new Ave();

        @SuppressWarnings("unused")
        Kangoroo k = new Kangoroo();
        Cachorro c = new Cachorro();
        @SuppressWarnings("unused")
        Cobra s = new Cobra();
        @SuppressWarnings("unused")
        Tartaruga t = new Tartaruga();
        @SuppressWarnings("unused")
        Goldfish g = new Goldfish();
        @SuppressWarnings("unused")
        Arara ar = new Arara();

        c.reagir("Ola");
        c.reagir("Vai Apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5);
        c.reagir(17, 4.5);
    }
}