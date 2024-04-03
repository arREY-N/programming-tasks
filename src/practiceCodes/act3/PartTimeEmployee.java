package practiceCodes.act3;

public class PartTimeEmployee extends Employee{
    private double wage;

    PartTimeEmployee(String name, int age, double ratePerHour, int hoursWorked, char status){
        this.wage = ratePerHour * hoursWorked;
        
        super.setName(name);
        super.setAge(age);
        super.setRatePerHour(ratePerHour);
        super.setHoursWorked(hoursWorked);
        super.setStatus(status);
        super.setSalary(this.wage);
    }
    
}
