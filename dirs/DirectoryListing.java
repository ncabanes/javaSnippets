// DirectoryListing : Files and dirs in the current directory
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.File;

class DirectoryListing { 
    public static void main( String args[] ) { 

        File currentDirectory = new File(".");
        File[] files = currentDirectory.listFiles();
        for (File f : files) {
            if (f.isDirectory())
                System.out.println(f.getName() + " <DIR>");
            else if (f.isFile()) {
                System.out.println(f.getName() + " : " + f.length());
            }
        }
    }
}
