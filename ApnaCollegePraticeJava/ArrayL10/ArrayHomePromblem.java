package apnacollege.ArrayL10;

import java.util.Scanner;

public class ArrayHomePromblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] num = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();

        }
        //
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        System.out.println(max);
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i]; // maxmimum value
            }
            if (num[i] < min) {
                min = num[i]; // minimum value
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
