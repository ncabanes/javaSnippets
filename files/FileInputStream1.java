// FileInputStream1.java : Amount of "a" in any file
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.*;
 
class FileInputStream1
{
 
    public static void main( String[] args )
    {
        System.out.println("Counting \"a\"...");
        int amount = 0;
 
        try {
            FileInputStream inputFile =
                new FileInputStream(new File("example.bin"));
 
            int data = inputFile.read();
 
            while (data  != -1) {  // -1 -> end of file
               if (data == 97)     // 97 = ASCII code for "a"
                    amount++;
                data = inputFile.read();
            }
            inputFile.close();
        }
        catch (Exception e) {
            System.out.println(
                "Something went wrong: " +
                e.getMessage() );
        }
 
        System.out.println("Amount of \"a\" found: " + amount);
    }
}
