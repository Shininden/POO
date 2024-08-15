package POO.Guanabara.Aula14;

public class Video implements AcoesVideo
{
    private String title;
    private int avaliacao;
    private int views;
    private int likes;
    private boolean isPlaying;

    public Video(String titulo) 
    {
        setTitle(titulo);  
        setAvaliacao(1);
        setViews(0);
        setPlaying(false);
    }

    @Override
    public void play() 
    {
        setPlaying(true);
    }
    @Override
    public void pause() 
    {
        setPlaying(false);
    }
    @Override
    public void like() 
    {
        setLikes(1);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) 
    {
        //int nova = (int) ((getAvaliacao() + avaliacao) / getViews());
        //setAvaliacao(nova);
    }

    public int getViews() {
        return views;
    }
    public void setViews(int increment) {
        this.views += increment;
    }

    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes += likes;
    }

    public boolean isPlaying() {
        return isPlaying;
    }
    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public void status()
    {
        System.out.println("Titulo: " + getTitle());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Views: " + getViews());
        System.out.println("Likes: " + getLikes());
        System.out.println("Tá reproduzindo? " + isPlaying());
    }
}