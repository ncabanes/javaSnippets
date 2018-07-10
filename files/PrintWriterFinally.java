// PrintWriterFinally.java : Writing to a text file + "finally"
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.*;

public class PrintWriterFinally {
    public static void main(String[] args) {
        
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("example.txt");
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
