// User input data for an array
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Asking for size and reserving space
        System.out.print("How many data? ");
        int size = input.nextInt();
        int[] data = new int[size];

        // Asking for the individual data
        for (int i=0; i<size; i++) {
            System.out.print("Enter data " + (i+1) +": ");
            data[i] = input.nextInt();
        }

        // And displaying data
        System.out.print("Data: ");
        for (int n : data)
            System.out.print(n + " ");
        System.out.println();
        
        // Output example:
        // How many data? 3
        // Enter data 1: 20
        // Enter data 2: 55
        // Enter data 3: 34
        // Data: 20 55 34
    }
}
