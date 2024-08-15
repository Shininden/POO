package POO.Guanabara.Aula14;

public class Visualizacao 
{
    private JovemGafanhoto espectador;
    private Video filme;

    public Visualizacao(JovemGafanhoto espectador, Video filme) 
    {
        setEspectador(espectador);
        setFilme(filme);
        getEspectador().setTotWatchedVideos(1);
        getFilme().setViews(1);
    }

    public JovemGafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(JovemGafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void status()
    {
        System.out.println("Espectador: " + getEspectador().getName());
        System.out.println("Filme: " + getFilme().getTitle());
        System.out.println("Filme: " + getFilme().getAvaliacao());
    }

    public void avaliar()
    {
        getFilme().setAvaliacao(5);
    }

    public void avaliar(int nota)
    {
        getFilme().setAvaliacao(nota);
    }

    public void avaliar(double porcent)
    {
        int tot;
        
        if(porcent <= 20)
            tot = 3;

        else if(porcent <= 50)
            tot = 5;

        else if(porcent <= 90)
            tot = 8;

        else
            tot = 10;

        getFilme().setAvaliacao(tot);
     }
}