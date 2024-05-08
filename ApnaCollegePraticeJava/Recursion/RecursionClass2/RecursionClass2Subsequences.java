package apnacollege.Recursion.RecursionClass2;

public class RecursionClass2Subsequences {
    public static void subSequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currenchar = str.charAt(idx);

        // to be add current char
        subSequences(str, idx + 1, newString + currenchar);
        // to be not add current char
        subSequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, " ");

    }
}
