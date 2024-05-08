package apnacollege.pattern;

import java.util.Scanner;

public class Q5PatternIHPRP {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
