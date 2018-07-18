// BinaryFileBlocks.java : Copying a whole file, using 512 KB blocks
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.*;
 
class BinaryFileBlocks
{
 
    public static void main( String[] args )
    {
        System.out.println("Copying binary file...");
        final int BUFFER_SIZE = 512*1024;
 
        try {
            InputStream inputFile = new FileInputStream(
                    new File("example.bin"));
            OutputStream outputFile = new FileOutputStream(
                    new File("example.out.bin"));
 
            byte[] buf = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = inputFile.read(buf, 0, 
                    BUFFER_SIZE)) > 0)  {
                outputFile.write(buf, 0, bytesRead);
            }
            inputFile.close();
            outputFile.close();
        }
        catch (Exception fileError) {
            System.out.println(
                "Problems found: " + fileError.getMessage() );
        }
 
        System.out.println("Done!");
    }
}
