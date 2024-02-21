package practiceCodes.act1;

import java.util.Scanner;

public class LabExer1B extends numberManipulator {
    public static void main(String[] args) {
        // Creates an object named manipulator with the class numberManipulator 
        numberManipulator manipulator = new numberManipulator();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        userNumber = scan.nextInt();
        /*
            Since we used the extends keyword, we're letting class LabExer1B inherit properties from class numberManipulator.
            One property we can use is the int userNumber defined in numberManipulator.
            Thus, in this class, we don't need to redefine userNumber and can just use it immediately.
        */

        // Calls the method 'showNumberPlus10' within the object 'manipulator' with userNumber as its argument
        manipulator.showNumberPlus10(userNumber);       
        manipulator.showNumberPlus100(userNumber);              
        manipulator.showNumberPlus1000(userNumber);     

        scan.close();
    }
}