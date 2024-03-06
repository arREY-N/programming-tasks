package Penus_Reyn.taskPerformance;

public class PartTimeEmployee extends Employee{
    private double ratePerHour;
    private int hoursWorked;
    private double wage;

    public void setWage(double ratePerHour, int hoursWorked){
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.wage = this.ratePerHour * this.hoursWorked;
    }

    public double getWage(){
        return wage;
    }

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Wage: %.2f", this.getWage());
    }
}
