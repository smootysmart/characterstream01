package characterstream;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Sa Mart");
            output.println("20");
            output.println("61.0");
            output.println("178.0");
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Scanner input = new Scanner(new FileReader("data.txt"));
            while(input.hasNext()){
                String name = input.nextLine();
                int age = input.nextInt();
                double weight = input.nextDouble();
                double height = input.nextDouble();
                System.out.println(name + " " + age + " " + weight + " " + height);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
