import java.nio.file.*;
import java.util.*;
import static java.nio.file.AccessMode.*;
import java.io.*;

public class LabExer6A {
    public static void main(String[] args) {
        Boolean cont = true;
        Scanner scan = new Scanner(System.in);
        int reps = 0;
        ArrayList<Integer> answered = new ArrayList<Integer>();

        while(cont == true || reps<10){
            Boolean guessed = false;
            reps++;
            String word = getWord(answered);
            ArrayList<Character> guessWord = removeLetter(word);
            ArrayList<Character> compareWord = new ArrayList<>();
    
            for(char w: word.toCharArray()){
                compareWord.add(w);
            }
            
            System.out.println("Guess the Medical Word!");
        
            while(guessed == false){
                for(char j: guessWord){
                    System.out.print(j);
                }
     
                System.out.print("\nEnter letter: ");
                char userInput = scan.nextLine().toUpperCase().charAt(0);

                if(compareWord.contains(userInput)){
                    for(int i=0; i<compareWord.size(); i++){
                        if(userInput == compareWord.get(i)){
                            guessWord.set(i, userInput);
                        }
                    }
                } 
     
                if(!guessWord.contains('?')){
                    System.out.print("\nThe word is: ");
                    for(char j: guessWord){
                        System.out.print(j);
                    }     
                    System.out.println("\n\nCongratulations!\n");
                    guessed = true;
                }
            }

            if(answered.size()!=10){
                System.out.println("Continue game? Y for Yes, Other keys for No");
                char play = scan.nextLine().toUpperCase().charAt(0);
                
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

    static String getWord(ArrayList<Integer> answered){
        Boolean textLine = false;
        Path filePath = Paths.get("words.txt");
        String guessWord = " ";
        int lineNumber = 0;
        
        while(textLine == false){
            lineNumber = (int) Math.floor(Math.random() * 10) + 1;
            
            if(!answered.contains(lineNumber)){
                answered.add(lineNumber);
                textLine = true;
            } else{
                continue;
            } 
        }
             
        int line = 0;

        try{
            filePath.getFileSystem().provider().checkAccess(filePath, READ);    

            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath.toString()));
                
                while(line!=lineNumber){
                    line++;
                    guessWord = reader.readLine(); 
                }    
            
                reader.close();
                return guessWord;
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

    static ArrayList<Character> removeLetter(String guessWord){
        Random random = new Random();
        Boolean randomBoolean;
        ArrayList<Character> fillWord = new ArrayList<Character>(); 

        for (char c : guessWord.toCharArray()) {
            randomBoolean = random.nextBoolean();
            if(randomBoolean==true){
                fillWord.add('?');
            } else{
                fillWord.add(c);
            }
        }
        return fillWord;
    }
}