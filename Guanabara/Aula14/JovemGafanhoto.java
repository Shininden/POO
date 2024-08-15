package POO.Guanabara.Aula14;

public class JovemGafanhoto extends Human
{
    private String login;
    private int totWatchedVideos;

    
    public JovemGafanhoto(String nome, int idade, String sexo, String login) 
    {
        super(nome, idade, sexo);
        setLogin(login);
        setTotWatchedVideos(0);
    }

    public void viuMais1()
    {
        setTotWatchedVideos(1);
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotWatchedVideos() {
        return totWatchedVideos;
    }
    public void setTotWatchedVideos(int increment) {
        this.totWatchedVideos += increment;
    }

    public void status()
    {
        System.out.println("Nome: " + getName());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("XP: " + getXp());
        System.out.println("Login: " + getLogin());
    }
}