package POO.Loiane.Contato_Exception;

import java.util.Scanner;

public class Teste 
{
    static int option = 0;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (option != 3) 
        {
            option = optionMenu(sc);

            if(option == 1)
                consultarContato(sc, agenda);

            else if(option == 2)
                adicionarContato(sc, agenda);
        }

        sc.close();
    } 
    
    public static int optionMenu(Scanner sc)
    {
        boolean isValid = false;
        
        while (!isValid)
        {
            System.out.println("1 - Consultar contato \n2 - Adicionar contato \n3 - Sair");

            try 
            {
                String entrada = sc.nextLine();
                option = Integer.parseInt(entrada);

                if(option == 1 || option == 2 || option == 3)
                    isValid = true;

                else 
                    throw new Exception("Entrada inválida, digite novamente\n");            
            } 
            catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n");
            }
        }

        return option;
    }

    public static void consultarContato(Scanner sc, Agenda agenda)
    {
        System.out.print("Digite o nome: ");
        String name = sc.nextLine();

        try {
            if(agenda.consultar(name) >= 0)
                System.out.println(name + " Existe");
        } 
        catch (DontExistException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void adicionarContato(Scanner sc, Agenda agenda)
    {
        System.out.println("Entre com as infos do contato");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        Contato contato = new Contato(nome, telefone, email);
        System.out.println(contato);

        try {
            agenda.adicionarContato(contato);
        } 
        catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos na agenda");
            System.out.println(agenda);
        }
    }
}