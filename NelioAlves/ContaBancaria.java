package POO.NelioAlves;

import java.util.Scanner;

public class ContaBancaria 
{
    private String accountNumber;
    private String name;
    private double balance;
    

    public ContaBancaria(Scanner sc) 
    {
        System.out.println("We are now registering your info");
        
        System.out.println("--------------------------");

        System.out.print("Enter account number: ");
        this.accountNumber = sc.nextLine();;

        System.out.print("Enter account holder: ");
        setName(sc.nextLine());

        System.out.print("Would you want to enter an initial deposit? [Y/N] ");
        if(sc.nextLine().equalsIgnoreCase("Y"))
        {
            System.out.print("Enter initial deposit value: ");
            deposit(sc);
        }

        System.out.println();
        showData();
    }

    public void deposit(Scanner sc)
    {
        System.out.println("--------Some Time Later on--------");
        System.out.print("Enter a deposit value: ");
        setBalance(sc.nextDouble());
        showData();
    }

    public void withdraw(Scanner sc)
    {
        System.out.print("Enter a withdraw value: ");
        setBalance( (sc.nextDouble() * -1) -5 );
        showData();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public void showData() 
    {
        System.out.println( "Account Data:" + 
        "\nAccount: " + accountNumber + ", Holder name: " + name + ", Balance: " + balance + "\n");
    }
}