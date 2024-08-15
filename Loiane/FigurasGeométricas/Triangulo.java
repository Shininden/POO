package POO.Loiane.FigurasGeométricas;

public class Triangulo extends Figura2D
{
    private int base, height;

    public Triangulo(int base, int height, String name) 
    {
        setBase(base);
        setHeight(height);
        setName(name);
    }

    @Override
    public double calcularArea() 
    {
        return (base * height) / 2;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}