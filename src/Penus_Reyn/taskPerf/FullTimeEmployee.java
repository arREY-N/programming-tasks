package Penus_Reyn.taskPerf;

public class FullTimeEmployee extends Employee{

    private double monthlySalary;

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
        setMonthlySalary(salary);
    }

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    
    public double getMonthlySalary(){
        return monthlySalary;
    }

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Salary: %.2f%n", getMonthlySalary());
    }
}
