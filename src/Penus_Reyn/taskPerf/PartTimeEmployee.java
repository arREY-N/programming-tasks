package Penus_Reyn.taskPerf;

public class PartTimeEmployee extends Employee{
    private double ratePerHour;
    private int hoursWorked;
    private double wage;
    /*  
        using the Employee constructor for part-time employees in the Employee class 
        as a way to initialize the PartTimeEmployee constructor in this file
    */
    PartTimeEmployee(String name, double ratePerHour, int hoursWorked) {
        super(name, ratePerHour, hoursWorked);
        setWage(ratePerHour, hoursWorked);
    }

    public void setWage(double ratePerHour, int hoursWorked){
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.wage = this.ratePerHour * this.hoursWorked;
    }

    public double getWage(){
        return wage;
    }

    // overrides the writeOutput method in the superclass (Employee.java)
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Wage: %.2f%n", getWage());
    }
}
