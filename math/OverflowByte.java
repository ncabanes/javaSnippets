// OverflowByte : Example of overflow in a "byte" variable
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class OverflowByte { 
    public static void main( String args[] ) { 
        byte b = 100;
        System.out.println( "data = " + b );
        b += 100; 
        System.out.println( "data + 100 => data = " + b );
    }
    // Output:
    // data = 100
    // data + 100 => data = -56
}
