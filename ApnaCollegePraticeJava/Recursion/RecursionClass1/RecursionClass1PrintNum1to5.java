package apnacollege.Recursion.RecursionClass1;

import java.util.Scanner;

//print natural no. from by user kaha se kaha tak mana ki 1 to 5 print  
// Q. given Print Number from 1 to 5 .
public class RecursionClass1PrintNum1to5 {
    public static void printNumber(int startno, int endno) {
        if (startno == endno + 1) {
            return;
        }
        System.out.println(startno);
        printNumber(startno + 1, endno);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startno = sc.nextInt();
        int endno = sc.nextInt();
        printNumber(startno, endno);

    }
}
