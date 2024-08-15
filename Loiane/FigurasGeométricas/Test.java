package POO.Loiane.FigurasGeométricas;

public class Test 
{
    public static void main(String[] args) 
    {
        Quadrado quadrado = new Quadrado(2, "Square");
        Circulo circulo = new Circulo(2, "circle");
        Triangulo triangulo = new Triangulo(3,2, "Triangulo");

        Cubo cubo = new Cubo(3, "cubo");
        Cilindro cilindro = new Cilindro(2,3, "clinder");
        Piramide piramide = new Piramide(2,3, "piramide");


        FiguraGeometrica[] figura = new FiguraGeometrica[6];
        figura[0] = circulo;
        figura[1] = quadrado;
        figura[2] = triangulo;

        figura[3] = cubo;
        figura[4] = cilindro;
        figura[5] = piramide;

        for (FiguraGeometrica fg : figura) 
        {
            System.out.println("----------------");
            System.out.println(fg.getName());

            if(fg instanceof Figura2D)
            {
                Figura2D f2D = (Figura2D) fg;
                System.out.println(f2D.calcularArea());
            }

            else if(fg instanceof Figura3D)
            {
                Figura3D f3D = (Figura3D) fg;
                System.out.println(f3D.calcularVolume());
            }

        }
    }
}