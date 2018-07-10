// CountJavaFiles : Counting Java files in the current directory
//      and its subdirectories
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.io.File;

class CountJavaFiles { 
    public static void main( String args[] ) { 
        File currentDirectory = new File("..");
        int amount = countJavaFiles(currentDirectory);
        System.out.println("Java files found: " + amount);
    }
    
    private static int countJavaFiles(File dir) {

        int amountInThisDir = 0;
        File[] filesList = dir.listFiles();
        for (File f : filesList){
            if (f.isDirectory())
                amountInThisDir += countJavaFiles(f);
            else if (f.isFile()){
                String fileName = f.getName();
                // If the last 5 characters are ".java"
                if (fileName.lastIndexOf(".java") == fileName.length()-5) {
                    System.out.println(f.getName());
                    amountInThisDir++;
                }
            }
        }
        return amountInThisDir;
    }
}
