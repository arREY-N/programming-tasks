package Penus_Reyn.taskPerf;

public class FullTimeEmployee extends Employee{

    private double monthlySalary;
    /*  
        using the Employee constructor for full-time employees in the Employee class 
        as a way to initialize the FullTimeEmployee constructor in this file
    */
    FullTimeEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    
    public double getMonthlySalary(){
        return monthlySalary;
    }

    // overrides the writeOutput method in the superclass (Employee.java)
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Salary: %.2f%n", getMonthlySalary());
    }
}
