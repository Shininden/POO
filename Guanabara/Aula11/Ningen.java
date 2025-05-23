package POO.Guanabara.Aula11;

public abstract class Ningen 
{
    private String name;
    private int age;
    private String gender;

    public final void haveBirthday(){
        setAge(1);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age += age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() 
    {
        return "Pessoa: " + "nome = " + name + " idade = " + age + " gender = " + gender;
    }
}