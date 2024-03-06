package Penus_Reyn.taskPerformance;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }
    
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Salary: %.2f", this.getMonthlySalary());
    }
}
