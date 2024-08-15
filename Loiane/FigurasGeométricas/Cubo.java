package POO.Loiane.FigurasGeométricas;

public class Cubo extends Figura3D
{
    private int lados;

    public Cubo(int lado, String name) 
    {
        setLados(lado);
        setName(name);
    }

    @Override
    public double calcularVolume()
    {
        return Math.pow(lados, 3);
    }

    public int getLados() {
        return lados;
    }
    public void setLados(int lados) {
        this.lados = lados;
    }
}