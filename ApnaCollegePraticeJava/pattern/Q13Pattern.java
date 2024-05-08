package apnacollege.pattern;

import java.util.Scanner;

public class Q13Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // Enter the no. from user
        for (int i = 1; i <= n; i++) {
            // spaces print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 1rs half number print
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // 2nd half numbr print
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
