package Penus_Reyn.taskPerf;

import java.util.Scanner;

public class RunEmployee{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(i < 4){
            
            Employee employee;

            System.out.println("Enter name: ");
            String employeeName = scan.nextLine();
    
            System.out.println("Pree F for Full Time or P for Part Time");
            char response = scan.nextLine().toUpperCase().charAt(0);
    
            switch (response){
                case 'F':
                    System.out.println("Enter monthly Salary: ");
                    employee = new FullTimeEmployee(employeeName, scan.nextDouble());
                    employee.writeOutput();
                    break;
                case 'P':
                    System.out.println("Enter rate per hour and no. of hours worked separated by space:");
                    System.out.println("Sample: 107.50 13");
                    employee = new PartTimeEmployee(employeeName, scan.nextDouble(), scan.nextInt());
                    employee.writeOutput();
                    break;
                default:
                    System.out.println("Invalid input. Restart program!");
            }
            scan.nextLine();
        }
        scan.close();
        
    }
}
