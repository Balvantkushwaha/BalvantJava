package apnacollege.Recursion.RecursionClass2;

public class RecursionClass2Occurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOurance(String str, int idx, char element) {
        if (idx == str.length() - 1) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curretchar = str.charAt(idx);
        if (curretchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaahb";
        findOurance(str, 0, 'b');
    }
}
