package POO.Loiane.FigurasGeométricas;

public class Piramide extends Figura3D
{
    private int lados;
    private int height;

    public Piramide(int lados, int height, String name) 
    {
        setHeight(height);
        setLados(lados);
        setName(name);
    }

    @Override
    public double calcularVolume() 
    {
        return (lados * lados * height) / 3;
    }

    public int getLados() {
        return lados;
    }
    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
