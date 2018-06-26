// StringHandling.java : Example of string handling
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Scanner;

class StringHandling {
    public static void main( String args[] ) {
 
        // Assigning a value an displaying
        String text = "Hola"; 
        
        System.out.print( "The text is: " );
        System.out.println( text );
    
        // Concatenation
        text = text + " 1";
        System.out.println( "Now it is: " +  text);
        text = text + " 2";
        System.out.println( "And now: " +  text);
        
        // Length, single characters and substrings
        System.out.println( "Length: " + text.length() );
        System.out.println( "Second letter: " + text.charAt(1) );
        String substr = text.substring(2,6);
        System.out.println( "Four letters from pos 2: " + substr );
        
        // Most operations do not alter the original
        text.toUpperCase();
        System.out.println( "Uppercase? " + text );
        text = text.toUpperCase();
        System.out.println( "Now it really is uppercase: " + text );
        
        // We can compare strings
        String text2 = "Have";
        System.out.println( "Comparing text and text2: "
            + text.compareTo(text2) );    
        if (text.compareTo(text2) < 0)
            System.out.println( text+" is \"less than\" "+text2 );
        System.out.print( "Ignoring the case... " );
        if (text.compareToIgnoreCase(text2) > 0)
            System.out.println( text+" is \"greater than\" "+text2 );
        
        // Asking the user for their full name 
        System.out.print( "Enter your full name, please... ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println( "Hi, " + name);
        
        // And we can read only the first / next word
        System.out.print( "Enter several space-separated words ");
        String firstWord = input.next();
        System.out.println( "The first word is " + firstWord);
        
        // Output example
        // The text is: Hola
        // Now it is: Hola 1
        // And now: Hola 1 2
        // Length: 8
        // Second letter: o
        // Four letters from pos 2: la 1
        // Uppercase? Hola 1 2
        // Now it really is uppercase: HOLA 1 2
        // Comparing text and text2: -18
        // HOLA 1 2 is "less than" Have
        // Ignoring the case... HOLA 1 2 is "greater than" Have
        // Enter your full name, please... one two
        // Hi, one two
        // Enter several space-separated words one two three
        // The first word is one
    }
}
