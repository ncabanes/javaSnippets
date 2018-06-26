// ArrayBidimensional.java : Example of a bidimensional array
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class ArrayBidimensional {
    public static void main( String args[] ) {
 
        int[][] data = new int[3][2];
        data[0][0] = 5;
        data[0][1] = 1;
        data[1][0] = -2;
        data[1][1] = 3;
        data[2][0] = 6;
        data[2][1] = -4;
        
        int rows = data.length;
        int columns = data[0].length;
        for (int row = 0; row < rows; row++)
            for (int col = 0; col < columns; col++)
                System.out.println( "Data "+ row + "," + col + 
                    " is " + data[row][col] );
    }
}
