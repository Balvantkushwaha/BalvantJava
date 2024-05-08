package apnacollege.Recursion.RecursionClass2;

import java.util.HashSet;

public class RecursionClass2Uniquesubsequences {

    public static void subSequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currenchar = str.charAt(idx);

        // to be add current char
        subSequences(str, idx + 1, newString + currenchar, set);
        // to be not add current char
        subSequences(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        System.out.println(set);
        subSequences(str, 0, " ", set);

    }
}
