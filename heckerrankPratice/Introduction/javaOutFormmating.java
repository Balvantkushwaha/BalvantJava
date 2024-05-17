package heckerrankPratice.Introduction;

import java.io.*;
import java.util.*;

public class javaOutFormmating {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int Intvalue = sc.nextInt();
            float flaotvalue = sc.nextFloat();
            System.out.printf("%-15s %03d %.2f\n", str, Intvalue, flaotvalue);

        }

        System.out.println("==============================");

    }
}
