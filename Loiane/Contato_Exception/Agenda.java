package POO.Loiane.Contato_Exception;

public class Agenda 
{
    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public int consultar(String n) throws DontExistException
    {
        for (int i = 0; i < contatos.length; i++) 
        {
            if(contatos[i] != null && contatos[i].getName().equalsIgnoreCase(n))
                return i;
        }

        throw new DontExistException(n);
    }


    public void adicionarContato(Contato c) throws AgendaCheiaException
    {
        boolean isFull = true;

        for (int i = 0; i < contatos.length; i++) 
        {
            if(contatos[i] == null)
            {
                contatos[i] = c;
                isFull = false;
                break;
            }
        }

        if(isFull)
            throw new AgendaCheiaException();
    }

    @Override
    public String toString() 
    {
        String s = "";

        for (Contato c : contatos)
        {
            if(c != null)
                s += c.toString() + "\n";
        }
            
        return s;
    }
}