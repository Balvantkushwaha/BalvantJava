// Q3. Place Tiles of size 1xm in  a floor of size nxm.
public class Q3 {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        } else if (n < m) {
            return 1;
        }
        // horijontal place // vartical place
        return placeTiles(n - 1, m) + placeTiles(n - m, m);
    }

    public static void main(String[] args) {
        int n = 4, m = 5;
        System.out.println(placeTiles(n, m));

    }
}
