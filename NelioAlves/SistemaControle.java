package POO.NelioAlves;

import java.util.Scanner;

public class SistemaControle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ContaBancaria p1 = new ContaBancaria(sc);
        p1.deposit(sc);
        p1.withdraw(sc);
    }
}