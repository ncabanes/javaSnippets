// Showing the contents of an array (of double precision numbers)
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

public class ArrayShow {
    public static void main(String[] args) {
        double[] data = { 8, 7, 6.5, 5.1, 4 };

        // This should be avoided: it uses "magic numbers"
        for (int i=0; i<5; i++)
            System.out.print(data[i] + " ");
        System.out.println();
 
        // More readable: find the "length" of the array
        for (int i=0; i<data.length; i++)
            System.out.print(data[i] + " ");
        System.out.println();
        
        // Also, to get ALL the data, "foreach"
        for (double n : data)
            System.out.print(n + " ");
        System.out.println();
    }
}
