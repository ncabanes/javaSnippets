// Example of an array of arrays
//      (see also ArryBidimensional.java)
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class ArrayOfArrays {
    public static void main( String args[] ) {
 
        int[][] data = new int[3][];
        
        data[0] = new int[2];
        data[0][0] = 5;
        data[0][1] = 1;

        data[1] = new int[1];
        data[1][0] = -2;

        data[2] = new int[3];
        data[2][0] = 6;
        data[2][1] = -4;
        data[2][2] = 8;

        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data[i].length; j++)
                System.out.println( "Data "+ i + "," + j + 
                    " is " + data[i][j] );
    }
}
