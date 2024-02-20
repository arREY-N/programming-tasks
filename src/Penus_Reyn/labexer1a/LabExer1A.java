package Penus_Reyn.labexer1a;

public class LabExer1A {
    public static void main(String[] args) {
        int faveNumber = 1224;
        String faveCartChar = "Ben 10";
        char mi = 'M';
        char[] nickNameArray = {'R', 'e', 'y', 'n'};

        System.out.println(faveNumber + " is my favorite number.");
        System.out.println("I love " + faveCartChar + "!");
        System.out.println("My name is Reynal " + mi +". Penus.");
        System.out.print("You can call me ");

        for(char letter: nickNameArray){
            System.out.print(letter);
        }

        System.out.println(".");
    }
}
