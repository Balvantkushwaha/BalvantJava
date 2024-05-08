/**
 * Recursion3Ways
 */
// Q4. Find th number of ways in which you can invite n people to our party
// , single or in pairs
public class Q4 {
    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int way1 = callGuests(n - 1);
        // pair
        int way2 = (n - 1) * callGuests(n - 2);
        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(callGuests(n));
    }
}