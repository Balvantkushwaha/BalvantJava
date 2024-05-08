package apnacollege.Recursion.RecursionClass1;

import java.util.Scanner;

// Print number from 5 to 1 . by recursion 
class printNumber {
    public static void printNumb(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumb(n - 1);
    }
}

public class RecursionClass1PrintNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n no. rever print number");
        int n = sc.nextInt(); // input user soch that 5
        printNumber obj = new printNumber();
        obj.printNumb(n); // 5
    }
}
