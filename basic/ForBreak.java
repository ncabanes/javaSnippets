// ForBreak : interrupting a "for" loop
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class ForBreak { 
    public static void main( String args[] ) {
        loopToBeInterrupted:
        for ( int i = 1 ; i <= 10 ; i++ ) {
            if ( i== 6 ) 
                break loopToBeInterrupted;
            System.out.print( i + " " );
        }
    }
    // Output: 1 2 3 4 5
}
