// RandomNumbers : Random numbers from Math and from class Random
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class RandomNumbers { 

    public static void main( String args[] ) { 

        System.out.print( "A random (real) number between 0 (included) "
            +" and 1 (not included): ");
        System.out.println( Math.random() );
        System.out.print( "A random (integer) number between 0 and 99: ");
        System.out.println( (int)(Math.random()*100) );
        System.out.print( "A random (integer) number between 1 and 100: ");
        System.out.println( (int)(Math.random()*100+1) );
        System.out.print( "A random (integer) number between 50 and 150: ");
        System.out.println( (int)(Math.random()*101+50) );
        System.out.print( "A random lowercase letter: ");  // TO DO
        System.out.println( (char)(Math.random()*26+'a') );
        
        System.out.println();
        java.util.Random r = new java.util.Random();
        System.out.print( "Another random (real) number between 0 (included) "
            +" and 1 (not included): ");
        System.out.println( r.nextDouble() );
        System.out.print( "A random (integer) number between 0 and 99: ");
        System.out.println( r.nextInt(100) );
        System.out.print( "A random (integer) number between 1 and 100: ");
        System.out.println( r.nextInt(100)+1 );
        System.out.println("...");
    } 

}
