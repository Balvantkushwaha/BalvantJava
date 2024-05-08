package apnacollege.pattern;

import java.util.Scanner;

public class Q1Patternsolidrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and collom ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        // nested loop

        // outer loop
        for (int i = 1; i <= n; i++) {
            /// inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
