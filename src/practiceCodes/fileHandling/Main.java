package practiceCodes.fileHandling;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Players> playerList = new ArrayList<Players>();
    public static void main(String[] args) {
        readFile();
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        System.out.println("Let's play!");

        while (loop == true) {
            System.out.println("A: Create new character");
            System.out.println("B: See characters");
            System.out.println("C: Exit");

            switch (scan.nextLine().toLowerCase().charAt(0)) {
                case 'a':
                    createCharacter(scan);
                    break;
                case 'b':
                    seeCharacter(scan);    
                    break;
                case 'c':
                    loop = false;
                    break;    
                default:
                    System.out.println("Input not in the options!");
                    break;
            }
        }

        scan.close();
    }

    static void createCharacter(Scanner scan){
        System.out.println("\nAdding New Character\n");
        System.out.print("Enter character name: ");
        String charName = scan.nextLine().toUpperCase().trim();

        Players player = new Players(charName);
        playerList.add(player);
        System.out.println();
        setFile();
    }

    static void seeCharacter(Scanner scan){
        System.out.println("\nPlayer List");
        for (Players players : playerList) {
            System.out.printf("%s%n", players.getName());
        }
        System.out.println();
    }

    static void readFile(){
        System.out.println("Reading file");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\practiceCodes\\fileHandling\\playerName.txt"));
            String line;

            while((line = reader.readLine()) != null){
                playerList.add(new Players(line));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        System.out.println();
    }

    static void setFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\practiceCodes\\fileHandling\\playerName.txt"));
            for (Players players : playerList) {
                writer.write(players.getName() + "\n");
            }   
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

