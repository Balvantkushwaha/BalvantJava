package apnacollege.Recursion.RecursionClass1;

// print x^n (stact height = n) .
public class RecusionClass1StackHeight {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpowernum = printPower(x, n - 1);
        int xpower = x * xpowernum;
        return xpower;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = printPower(x, n);
        System.out.println(ans);
    }
}
