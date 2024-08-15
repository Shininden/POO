package POO.Loiane.ExerImposto_de_Renda;
import java.util.Scanner;

public class CalculoImposto 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Contribuinte[] c = new Contribuinte[6];
        c[0] = new Contribuinte();
        c[1] = new Contribuinte();
        c[2] = new Contribuinte();
        c[3] = new Contribuinte();
        c[4] = new Contribuinte();
        c[5] = new Contribuinte();


        for (int i = 0; i < c.length; i++) 
        {
            System.out.print("Nome: ");
            c[i].setName(sc.nextLine());

            System.out.print("Tipo do documento: ");
            c[i].setTipoDoc(sc.nextLine());

            System.out.print("Renda: ");
            c[i].setIncome(sc.nextDouble());
            System.out.println();

            sc.nextLine();
        }

        for (int i = 0; i < c.length; i++) 
        {
            double renda = c[i].getIncome();
            String nomeContibuinte = c[i].getName();

            if(renda <= 1400)
                System.out.println(nomeContibuinte + ": A aliquota é de 0%, não há parcelas pra deduzir");

            else if( (1400.01 <= renda && renda <= 2100) || c[i].getTipoDoc().equalsIgnoreCase("PJ"))
                System.out.println(nomeContibuinte + ": A aliquota é de 10%, a parcela a deduzir é de: " + (renda * 0.10 - 100));

            else if(2100.01 <= renda && renda <= 2800)
                System.out.println(nomeContibuinte+ ": A aliquota é de 15%, a parcela a deduzir é de: " + (renda * 0.15 - 270));

            else if(2800.01 <= renda && renda <= 3600)
                System.out.println(nomeContibuinte + ": A aliquota é de 25%, a parcela a deduzir é de: " + (renda * 0.25 - 500));

            else if(renda >= 3600.01)
                System.out.println(nomeContibuinte + ": A aliquota é de 30%, a parcela a deduzir é de: " + (renda * 0.30 - 700));
        }

        sc.close();
    }
}