// TwoClasses : Two classes in the same file
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

// Only the main class can be public
// and it must be named like the file
public class TwoClasses {

  public static void main( String args[] ) { 
    Secondary s = new Secondary();

    s.sayHello(); // Greeting from "Secondary"
    sayHello(); // Greeting from "TwoClasses" (main)
  } 

  public static void sayHello() { 
    System.out.println( "Greetings from the main class" ); 
  } 

} 


// ----------------------------------------------------

// The other class(es) cannot be public
class Secondary { 

  public void sayHello() { 
    System.out.println( "Greetings from the secondary class" );
  } 

} 
