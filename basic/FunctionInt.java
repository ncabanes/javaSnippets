// FunctionInt.java : A simple function returning an int
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class FunctionInt { 
    
    public static int sum( int n1, int n2, int n3 ) { 
        return n1+n2+n3;
    }
        
    public static void main( String args[] ) { 
        System.out.println(  sum ( 1, 2, 3 ) );
        int a = 5, b = 6, c = 7;
        int d = sum(a, b, c);
        
        // Output:
        // 6
        // 18
    } 
} 
