package POO.Loiane.Contato_Exception;

public class DontExistException extends Exception 
{
    private String nome;

    public DontExistException(String nomeContato) {
        this.nome = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " + nome + " não existe";
    }
}
