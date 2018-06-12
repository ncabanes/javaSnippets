// ForContinue : skipping an iteration of a "for" loop
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class ForContinue {
    public static void main( String args[] ) { 
        
        // Output: 1 2 3 4 5 7 8 9 10
        
        for ( int i = 1 ; i <= 10 ; i++ ) {
             if (i == 6) 
                 continue;
             System.out.print( i + " " );
        }
        
        // An alternative way, avoiding "continue":
        for ( int i = 1 ; i <= 10 ; i++ ) {
             if (i != 6) 
                System.out.print( i + " " );
        }
    }
}
