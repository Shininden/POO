package POO.Loiane.Contato_Exception;

public class AgendaCheiaException extends Exception
{
    @Override
    public String getMessage() {
        return "Agenda já cheia";
    }
}
