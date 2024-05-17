package JavaPracticeCode;

import java.util.Scanner;

public class praticepattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. pramid");
        int n = sc.nextInt();
        // outter loop

        for (int row = 1; row <= n; row++) {

            for (int coml = 1; coml <= n - row; coml++) {
                System.out.print(" ");
            }
            // 1st half pyamidra
            for (int coml = row; coml >= 1; coml--) {
                System.out.print("*");
            }
            // second half pyamidra
            for (int coml = 2; coml <= row; coml++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
