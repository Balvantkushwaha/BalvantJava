package apnacollege;

import java.util.Scanner;

public class L4_Home_work_Promblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n no. ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // print all even no. till n
            if (i % 2 == 0) {
                System.out.println("apna college");
            }
        }

    }
}