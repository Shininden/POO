package POO.Guanabara.Aula12;

public class Ave extends Animal
{
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentarse() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }

}