package heckerrankPratice.Introduction;

import java.io.*;
import java.util.*;

public class datatype {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner obj = new Scanner(System.in);
        int test = obj.nextInt();
        for (int i = 1; i <= test; i++) {
            try {

                long x = obj.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)

                    System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)

                    System.out.println("* Short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)

                    System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)

                    System.out.println("* Long");
            } catch (Exception e) {
                System.out.println(obj.next() + " can't be fittd any where.");
            }
        }
    }
}
