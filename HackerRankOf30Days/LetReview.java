package HackerRankOf30Days;

import java.util.Scanner;

public class LetReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            System.out.println("sdfjsd;fsjd");
            String str = sc.nextLine();
            char[] mycharstr = str.toCharArray();
            String even = "";
            String odd = "";
            for (int j = 0; j < mycharstr.length; j++) {
                if (j % 2 == 0) {
                    even = even + mycharstr[j];
                } else {
                    odd = odd + mycharstr[j];
                }
            }
            System.out.print(even + " " + odd);
            System.out.println("my name");

        }

    }
}
