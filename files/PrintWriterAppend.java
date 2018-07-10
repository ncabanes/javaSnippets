// PrintWriterAppend.java : Appending to a text file
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.*;

public class PrintWriterAppend {
    public static void main(String[] args) {
        
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new BufferedWriter(
                new FileWriter("example3.txt", true))); 
            printWriter.println("Hello!");
            printWriter.println("and...");
            printWriter.println("good bye!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if ( printWriter != null )  {
                printWriter.close();
            }
        }
    }
}
