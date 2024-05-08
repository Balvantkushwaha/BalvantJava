
// Q2. Count total paths in a maze to move form (0,0) to (n,m)

public class Q2 {
    public static int countPaths(int i, int j, int n, int m) {

        if (i == n - 1 || j == m - 1) {
            return 1;
        }

        return countPaths(i + 1, j, n, m) + countPaths(i, j + 1, n, m);

    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalpaths = countPaths(0, 0, n, m);
        System.out.println(totalpaths);

    }
}
