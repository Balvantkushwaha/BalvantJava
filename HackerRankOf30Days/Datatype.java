package HackerRankOf30Days;

import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        Scanner scn = new Scanner(System.in);
        int intIn = scn.nextInt();
        double doubleIn = scn.nextDouble();
        scn.nextLine();
        String strIn = scn.nextLine();

        System.out.println(i + intIn);
        System.out.println(d + doubleIn);
        System.out.println(s + strIn);

    }
}
