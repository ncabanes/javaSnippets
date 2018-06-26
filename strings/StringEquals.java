// StringEquals.java : Checking the value of a string
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class StringEquals {
    public static void main( String args[] ) {
 
        String text1 = "Hi!";
        String text2 = "Hi";  text2 += "!";
        
        // First attempt : checking with == (the INCORRECT way)
        System.out.println( "First attempt..." );
        if (text1 == text2)
            System.out.println( "Both texts are the same" );
        else
            System.out.println( "Both texts are NOT the same" );
            
        // Second attempt : checking with .equals (the correct way)
        System.out.println( "Second attempt..." );
        if (text1.equals(text2))
            System.out.println( "Now both texts are the same" );
        else
            System.out.println( "Now both texts are NOT the same" );
            
        // Output:
        // First attempt...
        // Both texts are NOT the same
        // Second attempt...
        // Now both texts are the same
 
    }
}
