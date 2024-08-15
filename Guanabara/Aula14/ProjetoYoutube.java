package POO.Guanabara.Aula14;

public class ProjetoYoutube 
{
    public static void main(String[] args) 
    {
        Video[] v = new Video[3];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");

        JovemGafanhoto g[] = new JovemGafanhoto[2];
        g[0] = new JovemGafanhoto("Jubi", 27, "M", "Jubao");
        g[1] = new JovemGafanhoto("Creuza", 40, "F", "Croz");

        Visualizacao vis = new Visualizacao(g[0], v[2]);
        vis.status();
    }
}