package practiceCodes.act5_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get(
            "C:\\Users\\user\\OneDrive\\Documents\\School\\STI\\1st Year 2nd Sem\\Computer Programming 2\\Lab Activities\\src\\practiceCodes");
        Path code = Paths.get("Main.java");

        double count = filePath.getNameCount();    
        System.out.println("Path is: " + filePath.toString());
        System.out.println("File name is: " + filePath.getFileName());
        System.out.println("There are " + count +" element/s in the file path");
        for(int i = 0; i< count; i++){
            System.out.println((i+1) + ": " + filePath.getName(i));
        }

        System.out.println("\nThe relative path of this code is: " + filePath.toString());

        System.out.println("\nThe absolute path of this code is: " + code.toAbsolutePath().toString());
        
        // File file = new File("src\\practiceCodes\\act5_File\\hehe.txt");

        // if(file.exists()){
        //     System.out.println("Yeah\n");
        //     System.out.println(file.getAbsolutePath());
        //     System.out.println(file.isFile());
        //     file.delete();
        // } else {
        //     System.out.println("nah");
        // }

        // String[] names = {"John", "Carl", "Jerry"};

        // try {
        //     BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
        //     writer.write("Hello world!");
        //     writer.write("\nMy name is Reyn");

        //     for(String name: names){
        //         writer.write("\n"+name);
        //     }
        //     writer.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // try {
        //     BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        //     String line;

        //     while((line = reader.readLine()) != null){
        //         System.out.println(line);
        //     }
            
        //     reader.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // try {
        //     FileReader reader = new FileReader("file.txt");
        //     int data = reader.read();

        //     while(data != -1){
        //         System.out.print((char) data);
        //         data = reader.read();
        //     }
            
        //     reader.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }
}
