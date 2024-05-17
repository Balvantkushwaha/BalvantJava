package heckerrankPratice.String;

import java.util.Scanner;

public class javaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = A + B;
        System.out.println(C.length());
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1));
        System.out.println(A.substring(3, 5));

    }
}
