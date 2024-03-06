package Penus_Reyn.taskPerf;

public class PartTimeEmployee extends Employee{
    private double ratePerHour;
    private int hoursWorked;
    private double wage;

    PartTimeEmployee(String name, double ratePerHour, int hoursWorked) {
        super(name, ratePerHour, hoursWorked);
        setWage(ratePerHour, hoursWorked);
    }

    public void setWage(double ratePerHour, int hoursWorked){
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    public double getWage(){
        wage = ratePerHour * hoursWorked;
        return wage;
    }

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.printf("Wage: %.2f%n", getWage());
    }
}
