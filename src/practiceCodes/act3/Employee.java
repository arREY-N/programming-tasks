package practiceCodes.act3;

import java.util.HashMap;
import java.util.Set;

public class Employee {
    private HashMap<String, Employee> employeeList = new HashMap<>();
    private String name;
    private int age;
    private double salary;
    private char status;
    private double ratePerHour;
    private int hoursWorked;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setStatus(char status){
        this.status = status;
    }

    public void setRatePerHour(double ratePerHour){
        this.ratePerHour = ratePerHour;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public char getStatus(){
        return status;
    }

    public double getRatePerHour(){
        return ratePerHour;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    public void addEmployeeList(String name, Employee employee){
        employeeList.put(name, employee);
    }

    public void viewEmployeeList(){
        System.out.println("\nEMPLOYEE DATABASE");
        System.out.printf("%20s | %-5s %-7s %-7s%n","NAME", "AGE", "STATUS", "SALARY");
        
        Set<String> employeeKeys = employeeList.keySet();
        
        for(String keys: employeeKeys){
            Employee currentEmployee = employeeList.get(keys);
            System.out.printf("%20s | %-5d %-7c %-7.2f%n",currentEmployee.getName(), currentEmployee.getAge(), currentEmployee.getStatus(), currentEmployee.getSalary());
        }
    }
}
