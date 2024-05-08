
// Q1. Print all permutation of a string .
public class Q1 {
        public static void permuPrint(String str, String permutation) {
                if (str.length() == 0) {
                        System.out.println(permutation);
                        return;
                }
                for (int i = 0; i < str.length(); i++) {
                        char currenChar = str.charAt(i);
                        // if abc => bc
                        String newString = str.substring(0, i) + str.substring(i + 1);
                        permuPrint(newString, permutation + currenChar);
                }
        }

        public static void main(String[] args) {

                String st = "abcde";
                permuPrint(st, "");
        }
}
