package heckerrankPratice.Introduction;

import java.util.Scanner;

public class multiN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; 1 <= i && i <= 10; i++) {
            int result = n * i;
            System.out.println(n + "x" + i + "=" + result);
        }
    }

}
