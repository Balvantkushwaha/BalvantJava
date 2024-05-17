package heckerrankPratice.Introduction;

import java.util.Scanner;
import java.math.*;

public class power {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the no.of power");
        int n = obj.nextInt();
        // int result = 0;
        // for (int i = 0; i <= n; i++) {
        // // result = result * n;
        // result = Math.pow((2,63)-1)
        // System.out.println(result);

        System.out.println((Math.pow(2, n) - 1));

    }

}
