// Division: Dividing integers results in an integer
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

public class Division {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 3;
        
        System.out.println( 5 / 3 );
        System.out.println( n1 / n2 );
        
        System.out.println( 5.0 / 3 );
        System.out.println( 5 / 3.0 );
        System.out.println( (float) n1 / n2 );
        System.out.println( (double) n1 / n2 );
        
        // Output:
        // 1
        // 1
        // 1.6666666666666667
        // 1.6666666666666667
        // 1.6666666
        // 1.6666666666666667
    }
}
