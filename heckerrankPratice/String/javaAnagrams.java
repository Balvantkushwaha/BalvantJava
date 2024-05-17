package heckerrankPratice.String;

import java.util.Arrays;
import java.util.Scanner;

//import Codewithharry.escapeCharaters;

public class javaAnagrams {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        System.out.println(a1);
        System.out.println(a2);

        Arrays.sort(a1);
        Arrays.sort(a2);

        String str1 = new String(a1);
        String str2 = new String(a2);

        System.out.println(str1);
        System.out.println(str2);
        if (a1.length != a2.length) {
            System.out.println("Not Anagram");
        } else if (str1.equals(str2)) {
            System.out.println("Anagram");
        }

        else {
            System.out.println("Not Anagram33###$$%##%%#%#");
        }

    }
}