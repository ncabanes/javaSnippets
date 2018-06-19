// ArrayMax : Greatest value in an array
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Arrays;

public class ArrayMax {
    public static void main(String[] args) {

        int[] data = { 7, 8, -6, 1, 5, 4 };
        
        // Method 1: extracting the first value first
        int max = data[0];
        for (int i = 1; i < data.length; i++)
            if (data[i] > max)
                max = data[i];
        System.out.println("The max is: " + max);

        // Method 2: starting with the lowest possible value
        int max2 = Integer.MIN_VALUE;
        for (int n : data)
            if (n > max2)
                max2 = n;
        System.out.println("The max (v2) is: " + max2);
    }
}
