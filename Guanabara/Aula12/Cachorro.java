package POO.Guanabara.Aula12;

public class Cachorro extends Lobo 
{
    @Override
    public void emitirSom(){
        System.out.println("AU AU AU");
    }

    public void reagir(String frase)
    {
        if(frase.equalsIgnoreCase("Toma comida") || frase.equalsIgnoreCase("Ola"))
            System.out.println("Abanando e Latindo");

        else
            System.out.println("Rosnando");
    }

    public void reagir(int hora, int min)
    {
        if(hora < 12)
            System.out.println("Abanando");
        
        else if(hora >= 18)
            System.out.println("Ignorado");

        else 
            System.out.println("Abanar e Latir");
    }

    public void reagir(boolean isDono)
    {
        if(isDono)
            System.out.println("Abanar");
        else
            System.out.println("Rosnar e Latir");
    }

    public void reagir(int idade, double peso)
    {
        if(idade < 5)
        {
            if(peso < 10)
                System.out.println("Abanar");
            else
                System.out.println("Latir");
        }
        else
        {
            if(peso < 10)
                System.out.println("Rosnar");
            else    
                System.out.println("Ignorar");
        }
    }
}