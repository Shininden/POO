package POO.Loiane.FigurasGeométricas;

public class Quadrado extends Figura2D
{
    private int lado;

    public Quadrado(int lado, String name) 
    {
        setLado(lado);
        setName(name);
    }

    @Override
    public double calcularArea() 
    {
        return lado * lado;
    }

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }
}