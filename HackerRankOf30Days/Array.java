package HackerRankOf30Days;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // array size input by user mana ki 4 size of array
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();

        }
        for (int j = size - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }
    }
}
