package apnacollege.pattern;

import java.util.Scanner;

public class Q3Patternhalfpyramid {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        // halfpryamid
        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loops

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
