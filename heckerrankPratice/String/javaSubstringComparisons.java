package heckerrankPratice.String;

import java.util.Scanner;

public class javaSubstringComparisons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String smallest = s.substring(0, 0 + k);
        String largest = s.substring(0, 0 + k);
        for (int i = 0; i <= s.length() - k; i++) {
            String x = s.substring(i, i + k);
            if (largest.compareTo(x) < 0)// largest<x
            {
                largest = x;
            }
            if (smallest.compareTo(x) > 0) // smallest>x
            {
                smallest = x;
            }
            System.out.println(smallest + "\n" + largest);

        }
    }
}
