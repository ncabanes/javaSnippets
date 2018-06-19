// ArraySort : Sorting an array, the automatic way
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        double[] data = { 7, 8, -6.5, 1, 5.1, 4 };
        
        Arrays.sort(data);

        for (double n : data)
            System.out.println(n);
        
        // Output:
        // -6.5
        // 1.0
        // 4.0
        // 5.1
        // 7.0
        // 8.0
    }
}
