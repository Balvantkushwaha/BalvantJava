package apnacollege;

import java.util.Scanner;

public class L4_Home_work_Promblem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. 1 or 0");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("enter the marks ");
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is Good ");
            } else if (marks >= 60 && marks < 90) {
                System.out.println("This is also good ");
            } else if (marks >= 0 && marks < 60) {
                System.out.println("This is good as well");
            }

        }

        else {
            if (num == 0) {
                System.out.println("stop");
            } else {
                System.out.println("invailed");
            }
        }

    }
}
