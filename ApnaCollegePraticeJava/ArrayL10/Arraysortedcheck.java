package apnacollege.ArrayL10;

import java.util.Scanner;

public class Arraysortedcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();

        }

        boolean isArraySorted = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isArraySorted = false;
            }
        }
        if (isArraySorted) {
            System.out.println("this is array is sorted ");
        } else {
            System.out.println("this is array not sorted ");
        }
    }
}
