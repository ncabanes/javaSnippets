// Reading integers entered by the user (2: BufferedReader)
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadIntegerBR {
    public static void main(String[] args) {
        try
        {
            BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("Enter a number, please... ");
            int n1 = Integer.parseInt(input.readLine());
            System.out.println("Enter another number, please... ");
            int n2 = Integer.parseInt(input.readLine());
            System.out.print("The sum is: ");
            System.out.println(n1+n2);
        }
        catch (IOException e)
        {
            System.out.println("Problems! " + e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Not a valid number!");
        }
    }
}
