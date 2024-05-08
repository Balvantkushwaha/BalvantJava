package heckerrankPratice.Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class javaCurrencyformat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        String Us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String India = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String China = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String France = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("US: " + Us);
        System.out.println("India: " + India);
        System.out.println("China: " + China);
        System.out.println("France: " + France);
    }
}
