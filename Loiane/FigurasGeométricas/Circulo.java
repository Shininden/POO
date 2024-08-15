package POO.Loiane.FigurasGeométricas;

public class Circulo extends Figura2D
{
    private int raio;

    public Circulo(int raio, String name) 
    {
        setRaio(raio);
        setName(name);
    }

    @Override
    public double calcularArea() 
    {
        return 3.14 * raio * raio;
    }

    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
}