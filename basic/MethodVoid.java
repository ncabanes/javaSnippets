// MethodVoid.java : A method which does not return any value
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class MethodVoid { 
    
    public void writeSum( double n1, double n2) { 
        System.out.print(n1+n2);
    }
        
    public static void main( String args[] ) { 
        
        // If a method (function) is not static, we must
        // create an object in order to call that method
        MethodVoid example = new MethodVoid();
        
        example.writeSum(3, 5.6);
    } 
} 
