package apnacollege.TwoDArrayL11;

import java.util.Scanner;

public class TwoDarraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number rows and columns size");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        System.out.println("enter the search no.");
        int searchno = sc.nextInt();
        int[][] number = new int[rows][columns];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        // OUT PUT FORMAT
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        // search no.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (number[i][j] == searchno) {
                    System.out.println("x found location (" + i + "," + j + ")");
                }
            }
        }

    }
}
