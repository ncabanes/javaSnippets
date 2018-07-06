// RecursiveDirectoryListing : Listing of the current directory
//      and its subdirectories
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.File;

class RecursiveDirectoryListing { 
    public static void main( String args[] ) { 
        File currentDirectory = new File(".");
        readAndDisplayAllFiles(currentDirectory);
    }
    
    private static void readAndDisplayAllFiles(File dir) {

        File[] filesList = dir.listFiles();
        for (File f : filesList){
            if (f.isDirectory())
                readAndDisplayAllFiles(f);
            else if (f.isFile()){
                System.out.println(f.getName() + " : " + f.length());
            }
        }
    }
}
