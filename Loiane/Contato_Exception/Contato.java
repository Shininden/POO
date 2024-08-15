package POO.Loiane.Contato_Exception;

public class Contato 
{
    private static int contador = 0;
    private String name;
    private String telefone;
    private String email;
    private int id;

    public Contato(String name, String telefone, String email) 
    {
        setName(name);
        setTelefone(telefone);
        setEmail(email);
        contador++;
        id = contador;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() 
    {
        System.out.println();
        String s = "[ ";
        s += "ID: " + id;
        s += " | Nome: " + name;
        s += " | Telefone: " + telefone;
        s += " | Email: " + email + " ]";
        return s;
    }
}