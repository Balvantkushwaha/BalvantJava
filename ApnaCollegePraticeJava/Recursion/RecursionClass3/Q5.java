// Q5 . print all the subsets of a set of first n natural number 

import java.util.ArrayList;

public class Q5 {
    // method printsubset hai
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.printj(subset.get(i) + " ");
        }
        System.out.println();
    }

    // method findSubset hai
    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findSubset(n - 1, subset);

        // add nahi hoga
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);

    }
}
