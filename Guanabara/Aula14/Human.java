package POO.Guanabara.Aula14;

public abstract class Human 
{
    protected String name;
    protected int idade;
    protected String sexo;
    protected double xp;

    public Human(String nome, int idade, String sexo) 
    {
        setName(nome);
        setIdade(idade);
        setSexo(sexo);
        setXp(0);
    }

    protected void ganharXP()
    {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getXp() {
        return xp;
    }
    public void setXp(double xp) {
        this.xp = xp;
    }
}