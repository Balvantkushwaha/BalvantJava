package HackerRankOf30Days;

import java.util.Scanner;

public class javaOperator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double meal_cost = scn.nextDouble();
        int tax_percent = scn.nextInt();
        int tip_percent = scn.nextInt();

        double tax = (meal_cost * tip_percent) / 100;
        double tip = (tax_percent * meal_cost) / 100;
        System.out.println(tax);
        System.out.println(tip);

        double total_cost = meal_cost + tip + tax;
        int value = (int) total_cost;
        System.out.println(value);

    }
}
