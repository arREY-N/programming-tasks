package Penus_Reyn.taskPerformance;

import java.util.Scanner;

public class RunEmployee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String employeeName = scan.nextLine();

        System.out.println("Press F for Full Time or P for Part Time");
        String response = scan.nextLine().toUpperCase();

        switch (response) {
            case "F":
                // calls and sends the employyeName to the fullTime method in this class 
                fullTime(employeeName); 
                break;
            case "P":
                // calls and sends the employeeName to the partTime method in this class
                partTime(employeeName);  
                break;
            default:
                System.out.println("Invalid input. Restart program");
                break;
        }
        scan.close();
    }

    // Handles the creation of a new FullTimeEmployee object
    private static void fullTime(String employeeName){
        Scanner fullTimeScanner = new Scanner(System.in);

        FullTimeEmployee newFullTime = new FullTimeEmployee();
        newFullTime.setName(employeeName);
        
        System.out.println("Enter monthly salary: ");
        newFullTime.setMonthlySalary(fullTimeScanner.nextDouble());
        
        newFullTime.writeOutput();
        
        fullTimeScanner.close();
    }

    // Handles the creation of a new PartTimeEmployee object
    private static void partTime(String employeeName){
        Scanner partTimeScanner = new Scanner(System.in);
        
        PartTimeEmployee newPartTime = new PartTimeEmployee();
        newPartTime.setName(employeeName);
        
        System.out.println("Enter rate per hour and no of hours worked separated by space: ");
        System.out.println("Sample: 107.50 13");
        newPartTime.setWage(partTimeScanner.nextDouble(), partTimeScanner.nextInt());
        
        newPartTime.writeOutput();
        
        partTimeScanner.close();
    }
}