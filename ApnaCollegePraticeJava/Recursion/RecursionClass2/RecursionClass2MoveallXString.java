package apnacollege.Recursion.RecursionClass2;

// Move all 'x' to the end of the string 
public class RecursionClass2MoveallXString {
    public static void moveAllXString(String str, int idx, char element, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 1; i <= count; i++) {
                newString += element;
            }
            System.out.println(newString);
            return;
        }

        char currentchar = str.charAt(idx);
        if (currentchar == element) {
            count++;
            moveAllXString(str, idx + 1, element, count, newString);
            return;

        } else {
            newString += currentchar;
            moveAllXString(str, idx + 1, element, count, newString);
            return;
        }

    }

    public static void main(String[] args) {

        String str = "axbcxxd";
        char element = 'x';
        moveAllXString(str, 0, element, 0, "");

    }

}
