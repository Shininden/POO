package POO.Loiane.FigurasGeométricas;

public class Cilindro extends Figura3D
{
    private int raio, height;

    @Override
    public double calcularVolume() 
    {
        return 3.14 * raio * raio * height;
    }

    public Cilindro(int raio, int height, String name) 
    {
        setHeight(height);
        setRaio(raio);
        setName(name);
    }
    
    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}