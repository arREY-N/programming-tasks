package practiceCodes.act1;

import java.util.Scanner;

public class LabExer1B {
    public static void main(String[] args) {
        numberManipulator manipulator = new numberManipulator();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int userNumber = scan.nextInt();
        
        //calls the method showNumberPlus10 with userNumber as its argument
        manipulator.showNumberPlus10(userNumber);       
        manipulator.showNumberPlus100(userNumber);              
        manipulator.showNumberPlus1000(userNumber);     

        scan.close();
    }
}
