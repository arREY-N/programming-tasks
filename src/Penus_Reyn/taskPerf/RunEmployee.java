package Penus_Reyn.taskPerf;

import java.util.Scanner;

public class RunEmployee{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Employee employee;
        // ^^ creates an object named employee from the Employee class

        System.out.println("Enter name: ");
        String employeeName = scan.nextLine();
    
        System.out.println("Pree F for Full Time or P for Part Time");
        char response = scan.nextLine().toUpperCase().charAt(0);
    
        switch (response){
            case 'F':
                System.out.println("Enter monthly Salary: ");
                employee = new FullTimeEmployee(employeeName, scan.nextDouble());
                /*  ^^
                    initializing the employee object with the subclass 
                    FullTimeEmployee with the name and the salary as its arguments
                */
                   
                employee.writeOutput();
                /*  ^^
                    calls the writeOutput method in the employee class, which is 
                    overriden by the writeOutput in the FullTimeEmployee subclass
                */
                break;
            case 'P':
                System.out.println("Enter rate per hour and no. of hours worked separated by space:");
                System.out.println("Sample: 107.50 13");
                
                employee = new PartTimeEmployee(employeeName, scan.nextDouble(), scan.nextInt());
                /*  ^^
                    initializing the employee object with the subclass 
                    PartTimeEmployee with the name, rate, and number of hours worked as its arguments
                */
                
                employee.writeOutput();
                /*  ^^
                    calls the writeOutput method in the employee class, which is 
                    overriden by the writeOutput in the PartTimeEmployee subclass
                */
                break;
            default:
                System.out.println("Invalid input. Restart program!");
        }
        scan.close();        
    }
}