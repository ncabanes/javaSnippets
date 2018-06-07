// IfBraces: conditions and compound statements
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Scanner;

public class IfBraces {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = input.nextInt();
        
        if (n1 == 0) {
            System.out.println("0 / n = 0");
        }
        else {   // Braces are required before a compound statement     
            System.out.println("Enter another number: ");
            int n2 = input.nextInt();
            if (n2 == 0) {
                System.out.println("n / 0 = inf");
            }
            else {  // Braces are recommended before a simple statement
                System.out.println("n1 / n2 = " + 
                    ( (double) n1 / n2) );
            }
        }
    }
}
