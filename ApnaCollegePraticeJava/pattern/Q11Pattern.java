package apnacollege.pattern;

import java.util.Scanner;

public class Q11Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter the no. from User
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // spaces print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars print
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
