package apnacollege.Recursion.RecursionClass2;

import java.util.Scanner;

// print a string in reverse .
public class RecursionClass2StringReverse {
    public static void stringReversePrint(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        stringReversePrint(str, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringReversePrint(str, str.length() - 1);
    }
}
