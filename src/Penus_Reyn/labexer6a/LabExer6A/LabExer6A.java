import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static java.nio.file.AccessMode.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LabExer6A {
    public static void main(String[] args) {
        Boolean cont = true;
        Scanner scan = new Scanner(System.in);
        int reps = 0;
        // stores all of the answered lines
        ArrayList<Integer> answered = new ArrayList<Integer>(); 

        // while player chooses to play or as long as the list is not all used
        while(cont == true || reps<10){
            Boolean guessed = false;
            reps++;
            
            // selects a word from the list that hasn't been answered
            String word = getWord(answered);    

            // list of characters of the correct selected word
            ArrayList<Character> compareWord = new ArrayList<>();
            for(char w: word.toCharArray()){
                compareWord.add(w);
            }

            // changes some of the characters into ? and stores them 
            ArrayList<Character> guessWord = removeLetter(word);
            
            // start of the display
            System.out.println("Guess the Medical Word!");
        
            while(guessed == false){
                // prints out the word with the missing characters
                for(char j: guessWord){
                    System.out.print(j);
                }
     
                System.out.print("\nEnter letter: ");
                char userInput = scan.nextLine().toUpperCase().charAt(0);

                // checks if the input is included in the correct spelling
                if(compareWord.contains(userInput)){
                    // ensures that all instances of the letters are checked
                    for(int i=0; i<compareWord.size(); i++){
                        if(userInput == compareWord.get(i)){
                            // changes the ? character into the write letter
                            guessWord.set(i, userInput); 
                        }
                    }
                } 
                
                // checks if there are still missing characters
                if(!guessWord.contains('?')){
                    System.out.print("\nThe word is: ");
                    for(char j: guessWord){
                        System.out.print(j);
                    }     
                    System.out.println("\n\nCongratulations!\n");
                    guessed = true;
                }
            }

            // condition to check if all words are used
            if(answered.size()!=10){
                System.out.println("Continue game? Y for Yes, Other keys for No");
                char play = scan.nextLine().toUpperCase().charAt(0);
                
                // condition to check if the player wants to continue
                if (play == 'Y'){
                    cont = true;
                } else {
                    System.out.println("Thank you for playing!");
                    cont = false;
                    break;
                }                
            } else{
                System.out.println("All items guessed! Congratulations!");
                System.out.println("Thank you for playing!");
                cont = false;
            }
        }
        scan.close();    
    }

    // method to get the word from the file
    static String getWord(ArrayList<Integer> answered){
        Boolean textLine = false;
        Path filePath = Paths.get("words.txt");
        String guessWord = " ";
        int lineNumber = 0;
        
        // ensures that the chosen word has not been used in the previous rounds
        while(textLine == false){
            // generate a random number to choose which word to use
            lineNumber = (int) Math.floor(Math.random() * 10) + 1;
            
            // if the generated number is not yet used, save it then close the loop 
            if(!answered.contains(lineNumber)){
                answered.add(lineNumber);
                textLine = true;
            } else{
                continue;
            } 
        }

        try{
            // checks if the file is readable
            filePath.getFileSystem().provider().checkAccess(filePath, READ);    

            try {
                // creates an object to read the file
                BufferedReader reader = new BufferedReader(new FileReader(filePath.toString()));
                
                // iterates through the file until it reaches the specified line
                for(int line = 0; line!=lineNumber; line++){
                    guessWord = reader.readLine();
                }
            
                reader.close();
            } catch(NoSuchFileException e){
                System.out.println("File not found!");
            } catch(DirectoryNotEmptyException e){
                System.out.println("Directory not empty!");
            } catch(SecurityException e){
                System.out.println("No permission!");
            } catch (IOException e) {
                System.out.println("IO Exception!");
            }
        } catch(NoSuchFileException e){
            System.out.println("File not found!");
        } catch(DirectoryNotEmptyException e){
            System.out.println("Directory not empty!");
        } catch(SecurityException e){
            System.out.println("No permission!");
        } catch (IOException e) {
            System.out.println("IO Exception!");
        }
        
        return guessWord;
    }

    // changes some of the characters into ?
    static ArrayList<Character> removeLetter(String guessWord){
        Random random = new Random();
        Boolean randomBoolean;
        // creates an object to store the word with missing characters
        ArrayList<Character> fillWord = new ArrayList<Character>(); 

        /*  iterates through the letters of the word and randomly 
            chooses which characters will be turned into ?
        */
        for (char c : guessWord.toCharArray()) {
            randomBoolean = random.nextBoolean();
            if(randomBoolean == true){
                fillWord.add('?');
            } else{
                fillWord.add(c);
            }
        }
        return fillWord;
    }
}