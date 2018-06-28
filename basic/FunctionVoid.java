// FunctionVoid.java : A function which does not return any value
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class FunctionVoid { 
    
    public static void writeSum( double n1, double n2) { 
        System.out.print(n1+n2);
    }
        
    public static void main( String args[] ) { 
        writeSum(3, 5.6);
        
        // Note: the following line would not compile,
        // as the function does not return any value
        
        // System.out.println(  writeSum( 1.4, 7.8) );
    } 
} 
