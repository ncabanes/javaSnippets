// BufferedWriter1.java : Outputting data to a text file
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.*;
 
class BufferedWriter1 {
 
    public static void main( String[] args ) {
        try {
            BufferedWriter outputFile = new BufferedWriter(
                new FileWriter(new File("example.txt")));
 
            outputFile.write("Line 1");
            outputFile.newLine();
            outputFile.write("Line 2");
            outputFile.newLine();
 
            outputFile.close();
        }
        catch (IOException e) {
            System.out.println(
                "Ooops! Problems found: " +
                e.getMessage() );
        }
    }
}
