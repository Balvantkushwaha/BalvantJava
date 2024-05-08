package apnacollege.pattern;

import java.util.Scanner;

public class Q2Patternhollowrectangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the row and collom ");
        int n = obj.nextInt();
        int m = obj.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell --> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
