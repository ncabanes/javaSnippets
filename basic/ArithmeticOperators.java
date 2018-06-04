// Arithmetic operators & integer variables
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

public class ArithmeticOperators {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 5;
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
        
        // Sum, note the parentheses
        System.out.println("n1 + n2 = " + (n1+n2));
        
        // Subtraction
        System.out.println("n1 - n2 = " + (n1-n2));
        
        // Product
        System.out.println("n1 * n2 = " + (n1*n2));
        
        // Integer division
        System.out.println("n1 / n2 = " + (n1/n2));
        
        // Remainder of the division (modulus operator)
        System.out.println("n1 % n2 = " + (n1%n2));
        
        // With no parentheses: concatenation
        System.out.println("Concatenation of n1 and n2 = " + n1 + n2 );
    }
}
