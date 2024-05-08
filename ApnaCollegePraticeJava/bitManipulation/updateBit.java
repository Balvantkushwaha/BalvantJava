package apnacollege.bitManipulation;

import java.util.Scanner;

// Q. update the 2nd bit (position =1) of number n to 1 (n=0101)
/*
  For 0                                  For 1 
  BitMask : 1<<i                      BitMask : 1<<i
  Operation : AND with NOT           Operation : OR
  Clear Bit                           Set Bit 
 */
public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opera = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        if (opera == 1) {
            // set bit
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear bit
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
