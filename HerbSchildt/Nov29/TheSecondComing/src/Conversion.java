/*
    Type Casts
 */

class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 273;
        double d = 367.2346;

        System.out.println("\nint to byte");
        b = (byte) i;
        System.out.println(i + " -> " + b);

        System.out.println("\ndouble to int");
        i = (int) d;
        System.out.println(d + " -> " + i);

        System.out.println("\ndouble to byte");
        b = (byte) d;
        System.out.println(d + " -> " + b);

        System.out.println("\nW H A T  U P ?");
    }
}