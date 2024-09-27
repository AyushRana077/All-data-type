public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        // 1. byte
        byte byteValue = 100;
        System.out.println("Byte value: " + byteValue);

        // 2. short
        short shortValue = 10000;
        System.out.println("Short value: " + shortValue);

        // 3. int
        int intValue = 100000;
        System.out.println("Int value: " + intValue);

        // 4. long
        long longValue = 100000L;
        System.out.println("Long value: " + longValue);

        // 5. float
        float floatValue = 10.5f;
        System.out.println("Float value: " + floatValue);

        // 6. double
        double doubleValue = 20.99;
        System.out.println("Double value: " + doubleValue);

        // 7. char
        char charValue = 'A';
        System.out.println("Char value: " + charValue);

        // 8. boolean
        boolean booleanValue = true;
        System.out.println("Boolean value: " + booleanValue);

        // Reference Data Types
        // 1. String
        String stringValue = "Hello, Java!";
        System.out.println("String value: " + stringValue);

        // 2. Array
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Array value: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 3. Object
        Object objectValue = new Object();
        System.out.println("Object value: " + objectValue);

        // 4. Custom Class
        MyClass myClassInstance = new MyClass();
        System.out.println("Custom Class value: " + myClassInstance.message);
    }
}

class MyClass {
    String message = "This is a custom class!";
}
