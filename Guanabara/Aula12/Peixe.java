package POO.Guanabara.Aula12;

public class Peixe extends Animal
{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentarse() {
        System.out.println("Comer peixes menores");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe ñ faz som");
    }

    public void soltarBolha(){
        System.out.println("Soltando Bolhas");
    }
    

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}