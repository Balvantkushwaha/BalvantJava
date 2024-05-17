package heckerrankPratice.String;

import java.util.Arrays;
import java.util.Scanner;

public class javaAnagram2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram gfhsfdg");
            System.exit(0);
        }
        System.out.println("fjejrfofj");

        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0; i < s1.length(); i++) {
            if (a1[i] != a2[i]) {
                System.out.println("Not Anagram");
                System.exit(0);

            }
        }
        System.out.println("Anagram");

    }
}
