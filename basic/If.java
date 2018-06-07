// If: simple conditions checking
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = input.nextInt();
        System.out.print("Enter another number: ");
        int n2 = input.nextInt();
        
        // Braces are not strictly necessary if there is only one statement
        if (n1 == n2)
            System.out.println("You entered the same number twice");
        else if (n1 > n2)
            System.out.println("The first number is greater");
        else 
            System.out.println("The second number is greater");

        // Relational operators

        // ==  Equal to
        // !=  Not equal to
        // >   Greater than
        // <   Less than
        // >=  Greater than or equal to
        // <=  Less than or equal to
    }
}
