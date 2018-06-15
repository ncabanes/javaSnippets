// SwitchStrings : The switch command can use Strings (from Java 7 on)
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class SwitchStrings { 

    public static void main( String args[] ) { 

        String name = "Nacho";
        
        switch(name) {
            case "Albert": 
                System.out.println( "Hi, Albert!" ); 
                break;
            case "Nacho":
            case "Ignacio":
                System.out.println( "Hi, Nacho!" ); 
                break;
            case "John": 
                System.out.println( "Welcome, John!" ); 
                break;
            default: 
                System.out.println( "Who are you?" ); 
                break;
        }
    }
}
