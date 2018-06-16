// PrecisionFloat : Example of precision loss in a float value
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

class PrecisionFloat { 
    public static void main( String args[] ) { 
        float data = 1.23456789012f;
        System.out.println( "data = " + data);
        data += 1000; 
        System.out.println( "data + 1000 = " + data);
        
        // Output:
        // data = 1.2345679
        // data + 1000 = 1001.23456
    }
}
