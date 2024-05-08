package apnacollege.pattern;

import java.util.Scanner;

public class Q12Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            // spaces print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // number print
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();

        }
    }
}
