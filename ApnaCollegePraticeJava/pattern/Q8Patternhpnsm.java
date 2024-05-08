package apnacollege.pattern;

import java.util.Scanner;

public class Q8Patternhpnsm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        // outter loop
        for (int i = 1; i <= n; i++) {
            // innerloop
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
