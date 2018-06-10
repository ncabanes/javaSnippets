// While: contact with repetitive structures (1: while)
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        double dividend = input.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = input.nextDouble();
        
        while (divisor == 0) {
            System.out.println("You cannot divide by zero");
            System.out.print("Enter the divisor again: ");
            divisor = input.nextDouble();
        }
        
        System.out.println("Division = " + ( dividend / divisor) );
    }
}
