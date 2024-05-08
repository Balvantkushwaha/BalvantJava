package apnacollege.Recursion.RecursionClass2;

public class RecursionClass2Sortedarraycheck {
    public static boolean isSortedArray(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] >= arr[idx + 1]) {
            // sorted array till
            return false;

        }
        return isSortedArray(arr, idx + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 30, 40, 50, 60 };
        System.out.println(isSortedArray(arr, 0));
    }
}
