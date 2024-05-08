package apnacollege.ArrayL10;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        // int[] marks = new int[3];

        // marks[0] = 97;
        // marks[1] = 97;
        // marks[2] = 98;
        // int marks[] = { 97, 98, 95 };
        // System.out.println(marks);
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < marks.length; i++) {
            if (x == marks[i]) {
                System.out.println("x found at index " + marks[i]);
            }

        }
    }
}
