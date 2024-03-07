package Penus_Reyn.taskPerf;

public class Employee {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void writeOutput(){
        System.out.println("Name: " + this.getName());
    }

    // constructor for full-time employees, to be used by the FullTimeEmployee class
    Employee(String name, double salary){ 
        setName(name);
    }

    // constructor for part-time employees, to be used by the PartTimeEmployee class
    Employee(String name, double ratePerHour, int hoursWorked){ 
        setName(name);
    }
}
