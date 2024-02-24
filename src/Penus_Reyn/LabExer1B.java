package Penus_Reyn;

import java.util.Scanner;

public class LabExer1B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNumber = scan.nextInt();
        
        // Calls the method showNumberPlus10 with userNumber as its argument
        showNumberPlus10(userNumber);       
        showNumberPlus100(userNumber);              
        showNumberPlus1000(userNumber);     

        scan.close();
    }

    /*  
    *   showNumberPlus10 is a method which has an integer named userNumber as 
    *   its parameter
    */

    public static void showNumberPlus10(int userNumber){   
        // Uses the printf method to format and display the statement
        System.out.printf("%d plus 10 is %d.%n", userNumber, (userNumber+10));
    }

    public static void showNumberPlus100(int userNumber){
        System.out.printf("%d plus 100 is %d.%n", userNumber, (userNumber+100));
    }

    public static void showNumberPlus1000(int userNumber){
        System.out.printf("%d plus 1000 is %d.%n", userNumber, (userNumber+1000));
    }
}