package POO.NelioAlves.RentingSystem;

import java.util.Scanner;

public class Registration 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Tenant[] tenants = new Tenant[10];
        
        System.out.print("How many rooms will be rented? ");
        int rentedRooms = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < rentedRooms; i++) 
        {
            Tenant tenantData = new Tenant();

            System.out.println("Rent #" + (i+1)+":");
            
            System.out.print("Name: ");
            tenantData.setName(sc.nextLine());

            System.out.print("Email: ");
            tenantData.setEmail(sc.nextLine());

            System.out.print("Room: ");
            tenants[sc.nextInt()] = tenantData;
            sc.nextLine();

            System.out.println();
        }

        System.out.println("Busy rooms:");

        for (int i = 0; i < tenants.length; i++) 
        {
            if(tenants[i] != null){
                System.out.println(i + ": " + tenants[i].getName() + ", " + tenants[i].getEmail());
            }
        }
        sc.close();
    }
}