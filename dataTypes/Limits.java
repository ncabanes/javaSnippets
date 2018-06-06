// Limits of common numeric data types
// Part of JavaSnippets
// https://github.com/ncabanes/javaSnippets

public class Limits {
    public static void main(String[] args) {
        System.out.print("byte: " + Byte.SIZE +" bits, ");
        System.out.println(Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        System.out.print("short: " + Short.SIZE +" bits, ");
        System.out.println(Short.MIN_VALUE + " to " + Short.MAX_VALUE);

        System.out.print("int: " + Integer.SIZE +" bits, ");
        System.out.println(Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        System.out.print("long: " + Long.SIZE +" bits, ");
        System.out.println(Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.print("float: " + Float.SIZE +" bits, ");
        System.out.println(Float.MIN_VALUE + " to " + Float.MAX_VALUE);

        System.out.print("double: " + Double.SIZE +" bits, ");
        System.out.println(Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        
        System.out.print("char: " + Character.SIZE +" bits, ");
        System.out.println((int) Character.MIN_VALUE + " to " + 
            (int) Character.MAX_VALUE);
            
        // Output:
        // byte: 8 bits, -128 to 127
        // short: 16 bits, -32768 to 32767
        // int: 32 bits, -2147483648 to 2147483647
        // long: 64 bits, -9223372036854775808 to 9223372036854775807
        // float: 32 bits, 1.4E-45 to 3.4028235E38
        // double: 64 bits, 4.9E-324 to 1.7976931348623157E308
        // char: 16 bits, 0 to 65535
    }
}
