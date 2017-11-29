/*
    Automatic type promotion
 */

class Promote {
    public static void main(String[] args) {
        byte b = 127;
        char c = 'A';
        short s = 2364;
        int i = 23842384;
        float f = 324234.47598f;
        double d = .34624;

        double res = (f*b) + (i/c) - (s*d);
        System.out.println("res: " + res);
    }
}