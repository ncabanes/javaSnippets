// CountFor: counting 1 to 10 with "for"
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

import java.util.Scanner;

public class CountFor {
    public static void main(String[] args) {

        // First approach: while
        int i = 1;
        while (i <= 10) {
            System.out.print( i + " ");
            i++;
        }

        // Second approach: for
        for (i = 1; i <= 10; i++) {
            System.out.print( i + " ");
        }

        // Third approach: limit not included
        for (i = 1; i < 11; i++) {
            System.out.print( i + " ");
        }
    }
}
