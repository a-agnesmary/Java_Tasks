package data_types;
 
public class TypeConversion {

	public static void main(String[] args) {
		
		// Widening Conversions (Implicit)
		byte byteVal = 10;
        short shortVal = byteVal;   // byte to short
        int intVal = shortVal;      // short to int
        long longVal = intVal;      // int to long
        float floatVal = longVal;   // long to float
        double doubleVal = floatVal; // float to double
        char charVal = 'A';
        int charToInt = charVal; // char to int (ASCII value)
		
        System.out.println("Widening Conversions (Implicit):");
        System.out.println("byte to short: " + shortVal);
        System.out.println("short to int: " + intVal);
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);
        System.out.println("char to int (ASCII of 'A'): " + charToInt);

        // Narrowing Conversions (Explicit)
        double largeDouble = 99.99;
        float doubleToFloat = (float) largeDouble;  // double to float
        long floatToLong = (long) doubleToFloat;    // float to long
        int longToInt = (int) floatToLong;          // long to int
        short intToShort = (short) longToInt;       // int to short
        byte shortToByte = (byte) intToShort;       // short to byte

        int num = 66;
        char intToChar = (char) num; // int to char (ASCII value)

        System.out.println("\nNarrowing Conversions (Explicit):");
        System.out.println("double to float: " + doubleToFloat);
        System.out.println("float to long: " + floatToLong);
        System.out.println("long to int: " + longToInt);
        System.out.println("int to short: " + intToShort);
        System.out.println("short to byte: " + shortToByte);
        System.out.println("int to char: " + intToChar);
	}

}
