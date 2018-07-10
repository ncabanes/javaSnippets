// PrintWriterBasic.java : Writing to a text file, first approach
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PrintWriterBasic {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter ("example.txt");
            printWriter.println ("Hello!");
            printWriter.close (); 
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
