package main.java.BitOperations;

public class ShiftUsage {
    public static void leftAndRightShift() {
        int a = 60;
        int b = -60;
        int c = 0;
        System.out.println("60  = " + Integer.toBinaryString(a));
        System.out.println("-60 = " + Integer.toBinaryString(b));

        c = a >> 1;
        System.out.println("Right Shift is equavalent to dividing by power of 2");
        System.out.println("60 >> 1  = " + Integer.toBinaryString(c));
        System.out.println("60 >> 1  = " + c);

        int e= c >> 1;
        System.out.println("60 >> 1  = " + e);
        System.out.println("Left Shift is equavalent to multiplying by the power of 2");

        int f = a << 1;
        System.out.println("60 << 1  = " + f);
        int g = f << 1;
        System.out.println("60 << 1  = " + g);
    }
}
