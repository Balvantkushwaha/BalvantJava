package apnacollege.fuction;

import java.util.Scanner;

public class fuction1 {
    // public static int addTwoNo(int a, int b) {

    // return a + b;
    public static int multipleyTwoNo(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("sum of two no. is " + multipleyTwoNo(a, b));

    }
}
