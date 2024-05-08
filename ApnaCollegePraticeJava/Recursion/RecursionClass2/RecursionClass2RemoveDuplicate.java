package apnacollege.Recursion.RecursionClass2;

public class RecursionClass2RemoveDuplicate {
    public static boolean[] map = new boolean[26];

    public static void removeDupicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currenchar = str.charAt(idx);
        if (map[currenchar - 'a']) {
            removeDupicates(str, idx + 1, newString);
        } else {
            newString += currenchar;
            map[currenchar - 'a'] = true;
            removeDupicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDupicates(str, 0, "");
    }
}
