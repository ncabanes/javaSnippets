// DoWhile: contact with repetitive structures (2: do-while)
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        double dividend, divisor;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the dividend: ");
        dividend = input.nextDouble();
        do {
            System.out.print("Enter the divisor: ");
            divisor = input.nextDouble();
        
            if (divisor == 0) {
                System.out.println("You cannot divide by zero");
            }
        }
        while (divisor == 0);
        
        System.out.println("Division = " + ( dividend / divisor) );
    }
}
