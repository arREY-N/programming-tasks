package Penus_Reyn.labexer2;

import java.util.*;

public class LabExer2 {
    static private String itemName;
    static private double itemPrice;
    static private int itemQuantity;
    static private double amountDue;

    public static void main(String[] args) { 
        readInput();
        writeOutput();
        System.out.printf("Amount due is %.2f%n%n", getTotalCost());
    }

    public static void readInput(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name of the item you are purchasing");
        setItemName(s.nextLine());
        System.out.println("Enter the quantity and price separated by a space");
        setTotalCost(s.nextInt(), s.nextDouble());
        s.nextLine();

        s.close();
    }

    public static void writeOutput(){
        System.out.printf("You are purchasing %d %s(s) at %.1f each.%n", itemQuantity, getItemName(), itemPrice);
    }

    public static void setItemName(String newItemName){
        itemName = newItemName;
    }

    public static void setTotalCost(int quantity, double price){
        itemQuantity = quantity;
        itemPrice = price;
    }

    public static String getItemName(){
        return itemName;
    }

    public static double getTotalCost(){
        amountDue = itemQuantity * itemPrice; 
        return amountDue;
    }
}