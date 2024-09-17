package Tarea3;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        Byte byteObj = 10;
        Short shortObj = 20;
        Integer intObj = 30;
        Long longObj = 40L;
        Float floatObj = 50.0f;
        Double doubleObj = 60.0;
        Boolean booleanObj = true;
        Character charObj = 'A';

        byte bytePrimitive = byteObj;
        short shortPrimitive = shortObj;
        int intPrimitive = intObj;
        long longPrimitive = longObj;
        float floatPrimitive = floatObj;
        double doublePrimitive = doubleObj;
        boolean booleanPrimitive = booleanObj;
        char charPrimitive = charObj;

        System.out.println("Autoboxing:");
        System.out.println("byteObj: " + byteObj);
        System.out.println("shortObj: " + shortObj);
        System.out.println("intObj: " + intObj);
        System.out.println("longObj: " + longObj);
        System.out.println("floatObj: " + floatObj);
        System.out.println("doubleObj: " + doubleObj);
        System.out.println("booleanObj: " + booleanObj);
        System.out.println("charObj: " + charObj);

        System.out.println("\nUnboxing:");
        System.out.println("bytePrimitive: " + bytePrimitive);
        System.out.println("shortPrimitive: " + shortPrimitive);
        System.out.println("intPrimitive: " + intPrimitive);
        System.out.println("longPrimitive: " + longPrimitive);
        System.out.println("floatPrimitive: " + floatPrimitive);
        System.out.println("doublePrimitive: " + doublePrimitive);
        System.out.println("booleanPrimitive: " + booleanPrimitive);
        System.out.println("charPrimitive: " + charPrimitive);
    }
}
