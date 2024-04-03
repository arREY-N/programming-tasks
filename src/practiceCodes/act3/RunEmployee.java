package practiceCodes.act3;

import java.util.Scanner;

public class RunEmployee {
    private static Employee employee = new Employee();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean loop = true;
        while(loop == true){
            System.out.println("EMPLOYEE DATABASE");
            System.out.println("A: Add New Full-Time Employee");
            System.out.println("B: Add New Part-Time Employee");
            System.out.println("C: View All Employees");
            System.out.println("D: Exit");
            String input = scan.nextLine().trim();
            
            if(!input.isEmpty()){
                char action = input.toUpperCase().charAt(0);
                
                switch (action) {
                    case 'A':
                        addFullTime(scan);
                        break;
                    case 'B':
                        addPartTime(scan);
                        break;
                    case 'C':
                        employee.viewEmployeeList();
                        System.out.println();
                        break;
                    case 'D':
                        System.out.println("Thank you for using our system!");
                        loop = false;
                        break;
                    default:
                        System.out.println("Invalid input. Restart program");
                        break;
                }
            }
            else{
                System.out.println("No input. Restart program");
            }
        }
        scan.close();
    }

    public static void addFullTime(Scanner scan){
        try{
            System.out.println("Adding New Full-Time Employee");
            System.out.print("Name: ");
            String employeeName = scan.nextLine().toUpperCase();
            System.out.print("Age: ");
            int employeeAge = Integer.parseInt(scan.nextLine());
            System.out.print("Salary: ");
            double employeeSalary = Double.parseDouble(scan.nextLine());
            employee.addEmployeeList(employeeName, new FullTimeEmployee(employeeName, employeeAge, employeeSalary, 'F'));
        }
        catch (NumberFormatException e){
            System.out.println("Input must be a number!");
        }
            
        System.out.println("\n");
    }
    
    public static void addPartTime(Scanner scan){
        System.out.println("Adding New Part-Time Employee");
        System.out.print("Name: ");
        String employeeName = scan.nextLine().toUpperCase();
        System.out.print("Age: ");
        int employeeAge = Integer.parseInt(scan.nextLine());
        System.out.print("Rate: ");
        double employeeRate = Double.parseDouble(scan.nextLine());
        System.out.print("Hours: ");
        int hoursWorked = Integer.parseInt(scan.nextLine());
        employee.addEmployeeList(employeeName, new PartTimeEmployee(employeeName, employeeAge, employeeRate, hoursWorked, 'P'));
        System.out.println("\n");
    }
}
