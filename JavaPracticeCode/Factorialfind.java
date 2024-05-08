
import java.util.*;
import java.io.*;

class factorialfind {
    public static int factorialfinding(int n) {
        int result = 0;
        // 1.base case condition
        if (n == 0 || n == 1) {
            return 1;

        }
        // 2.Recursive function callingsṇ
        else {
            result = n * factorialfinding(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int result = factorialfinding(n);
        System.out.println(result);

    }
}
