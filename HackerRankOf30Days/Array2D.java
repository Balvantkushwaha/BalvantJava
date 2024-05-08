package HackerRankOf30Days;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array row and colom");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("enter the element of array ");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt(); // 2d array input2

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length - 2; row++) {
            for (int col = 0; col < arr.length - 2; col++) {
                sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col]
                        + arr[row + 2][col + 1] + arr[row + 2][col + 2];

                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);

    }
}
