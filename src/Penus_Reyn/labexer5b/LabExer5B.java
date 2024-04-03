package Penus_Reyn.labexer5b;
import java.util.InputMismatchException;
import java.util.Scanner;
public class LabExer5B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("Science Quiz Bee!");
        System.out.println("Choose among the 3 options the correct answer!\n");
        
        for(int i = 0; i < 10; i++){
        
            for(String e: getQuestions(i)){
                System.out.println(e);
            }

            try{
                System.out.print("Answer: ");
                char response = scan.nextLine().toUpperCase().charAt(0);
                
                if(Character.isWhitespace(response)){
                    i--;
                    throw new BlankInputException();
                }else{
                    switch (response) {
                        case 'A':
                            score += checkAnswer(i, 1);
                            break;
                        case 'B':
                            score += checkAnswer(i, 2);
                            break;
                        case 'C':
                            score += checkAnswer(i, 3);
                            break;
                        default:
                            i--;
                            throw new InputMismatchException();
                    }
                }
            }
            catch(InputMismatchException ime){
                System.out.println("\nINPUT_ERROR: [Invalid input. Try again!]\n");
            } 
            catch(BlankInputException bie){
                System.out.println(bie.getMessage());
            } 
            finally{
                System.out.println("Score: " + score + "/10\n");
            }
        }
        scan.close();
    }
    
    static int checkAnswer(int question, int answer){
        int[] answerKey = {3, 2, 2, 2, 1, 2, 3, 3, 2, 1};

        if(answer == answerKey[question]) {
            System.out.println("\nCorrect!\n");
            return 1;
        } else {
            System.out.println("\nWrong!\n");
            return 0;
        }
    }
    
    static String[] getQuestions(int questionNumber){
        String[][] questions = {
            {
                "1. Which planet in our Solar System is named after the Roman God of War?", 
                "A: Venus",
                "B: Mercury",
                "C: Mars"
            },{
                "2. How many planets are there in our Solar System?",
                "A: 9",
                "B: 8",
                "C: 7"
            },{
                "3. Which planet had the most number of moons?",
                "A: Uranus",
                "B: Jupiter",
                "C: Saturn"
            },{
                "4. What happens when the Moon is in between the Sun and Earth?",
                "A: Solar Flare",
                "B: Solar Eclipse",
                "C: Lunar Eclipse"
            },{
                "5. What is the hottest planet in the Solar System?",
                "A: Venus",
                "B: Mercury",
                "C: Earth"
            },{
                "6. Where is the Great Red Spot located?",
                "A: Mars",
                "B: Jupiter",
                "C: Venus"
            },{
                "7. Where is the tallest volcano in the Solar System located?",
                "A: Earth",
                "B: Saturn",
                "C: Mars"
            },{
                "8. In the movie Interstellar, where was the wormhole located?",
                "A: Near Jupiter",
                "B: Near Neptune",
                "C: Near Saturn"                
            },{
                "9. What is the term used when matter are stretched by a blackhole?",
                "A: Pastafication",
                "B: Spaghettification",
                "C: Noodlefied"
            },{
                "10. What is the process used by the Sun to generate heat and light?",
                "A: Nuclear Fussion",
                "B: Nuclear Fission",
                "C: Nuclear Combustion"
            }
        };
        return questions[questionNumber];
    }
}

class BlankInputException extends Exception{
    BlankInputException(){
        super("\nBLANK_ERROR: [Invalid input. Try again!]\n");
    }
} 