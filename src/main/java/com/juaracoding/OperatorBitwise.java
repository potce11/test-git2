package com.juaracoding;

public class OperatorBitwise {
    public static void main(String[] args) {
    byte a=3;
    byte b;
    String a_bits,b_bits;

    a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);

        //operator SHIFT LEFT
        System.out.println("======SHIFT LEFT");
        b=(byte) (a << 1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);

    }
}