package apnacollege.pattern;

import java.util.Scanner;

public class Q15patternHomePormlem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // upper half star print 1st part
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= n; j++) {

                // 1st part print
                if (j == 1 || j == n || i == j || i == n + 1 - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

}
