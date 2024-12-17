package POO.NelioAlves.Funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterEmployees
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();


        System.out.print("Enter the number of employees: ");
        int totalEmployees = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= totalEmployees; i++)
        {
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced ? (y/n) ");
            String yesORno = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Worked hours: ");
            int hours = sc.nextInt();

            sc.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            sc.nextLine();

            if(yesORno.equalsIgnoreCase("y"))
            {
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();

                sc.nextLine();

                Employee newOutEmployee = new OutsourcedEmployee(name, hours, valuePerHour, addCharge);
                employees.add(newOutEmployee);
            }
            else
            {
                Employee newRegEmployee = new Employee(name, hours, valuePerHour);
                employees.add(newRegEmployee);
            }
        }

        System.out.println("\n PAYMENTS:");
        System.out.println(employees);

        sc.close();
    }
}