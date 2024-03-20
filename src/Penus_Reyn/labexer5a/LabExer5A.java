package Penus_Reyn.labexer5a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExer5A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int RANDOM = (int) Math.floor((Math.random()*(50))+1);
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Guess a number from 1 to 50!");

        while(userGuess!=RANDOM){
            try{
                attempts++;
                userGuess = Integer.parseInt(scan.next());

                if(userGuess>50 || userGuess<1){
                    throw new OutOfRangeException();
                } else if(userGuess>RANDOM){
                    System.out.println("Too high. Try again.");
                } else if(userGuess<RANDOM){
                    System.out.println("Too low. Try again.");
                } else{
                    System.out.printf("You got it in %d attempt(s)!", attempts);
                }

            } 
            catch (OutOfRangeException oore){
                System.out.println(oore.getMessage());
                System.out.println("Guess a number from 1 to 50!");
            } 
            catch (NumberFormatException | InputMismatchException ime){
                System.out.println("Invalid input");
                System.out.println("Guess a number from 1 to 50!");
            } 
        }
        scan.close();
    }
}

class OutOfRangeException extends Exception{
    OutOfRangeException(){
        super("Out of range");
    }
}