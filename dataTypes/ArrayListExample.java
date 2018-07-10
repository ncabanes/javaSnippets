// ArrayListExample : entering data in an ArrayList of integers
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<String>();

        // Asking for the individual data
        String s;
        do {
            System.out.print("Enter text (empty to exit): ");
            s = input.nextLine();
            if (!s.isEmpty())
                data.add(s);
        } while (!s.isEmpty());
        
        // And displaying data
        System.out.print("Text: ");
        for (String n : data)
            System.out.print(n + " ");
        System.out.println();
        
        // Output example:
        // Enter text (empty to exit): welcome
        // Enter text (empty to exit): to these
        // Enter text (empty to exit): small programs
        // Enter text (empty to exit):
        // Text: welcome to these small programs
    }
}
