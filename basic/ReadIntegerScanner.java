// Reading integers entered by the user (1: Scanner)
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Scanner;

public class ReadIntegerScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers, please... ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.print("The sum is: ");
        System.out.println(n1+n2);
    }
}
