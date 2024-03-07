package Penus_Reyn.taskPerformance;

public class Employee {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void writeOutput(){
        System.out.println("Name: " + this.name);
    }
}