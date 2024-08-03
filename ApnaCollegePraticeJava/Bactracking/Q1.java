package ApnaCollegePraticeJava.Bactracking;

public class Q1 {
    public static void printPermutation(String str, int idx, String Permutation) {
        if (str.length() == 0) {
            System.out.println(Permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, idx + 1, Permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, 0, "");
    }
}
