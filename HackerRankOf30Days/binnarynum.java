package HackerRankOf30Days;

import java.util.Scanner;

public class binnarynum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        int max = 0;
        while (n > 0) {
            int a = n % 2;
            if (a == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
            n = n / 2;
        }
        System.out.println(max);
    }
}
