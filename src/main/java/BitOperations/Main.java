package main.java.BitOperations;

public class Main {
    public static void main(String[] args) {
        int a = 60;
        int b = -60;
        int c = 0;
        System.out.println("Right Shift Test");
        System.out.println("60  = " + Integer.toBinaryString(a));
        System.out.println("-60 = " + Integer.toBinaryString(b));

        //signed shift
        c = a >> 1;
        System.out.println("60 >> 1  = " + Integer.toBinaryString(c));
        System.out.println("60 >> 1  = " + c);

        int e= c >> 1;
        System.out.println("60 >> 1  = " + e);
        System.out.println("Left Shift Test");

        int f = a << 1;
        System.out.println("1 << 60  = " + f);
        int g = f << 1;
        System.out.println("1 << 60  = " + g);
        //unsigned shift
/*
        c = a >>> 1;
        System.out.println("60 >>> 1 = " + Integer.toBinaryString(c) );

        c = b >> 1;
        System.out.println("-60 >> 1  = " + Integer.toBinaryString(c) );

        c = b >>> 1;
        System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));
*/
    }
    }
