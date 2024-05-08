package apnacollege.Recursion.RecursionClass2;

//Tower of Honoi Q.  
public class RecursionClass2TowerofHonoi {
    public static void towerOfHonoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHonoi(n - 1, src, dest, helper);
        System.out.println(" transfer " + n + " from " + src + " to " + dest);
        towerOfHonoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHonoi(n, "S", "H", "D");
    }
}
