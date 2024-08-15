package POO.Guanabara.Aula12;

public class Reptil extends Animal
{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentarse() {
        System.out.println("Comer Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }
    

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}