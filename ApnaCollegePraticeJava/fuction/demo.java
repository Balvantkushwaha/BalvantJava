package apnacollege.fuction;

import java.util.Scanner;

public class demo {

    public static int calculte(int a, int b, int ch) {

        switch (ch) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;

            default:
                System.out.println("ivaid string");
                break;
        }
        int calcu = ch;
        return calcu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter the no. \n 1. add \n 2. sub \n 3. multi \n 4.divided ");
        int ch = sc.nextInt();

        int calcu = calculte(a, b, ch);

    }
}
