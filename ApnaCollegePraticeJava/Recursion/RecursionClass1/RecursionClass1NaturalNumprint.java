package apnacollege.Recursion.RecursionClass1;

// print sum of first n natural numbers .
public class RecursionClass1NaturalNumprint {
     public static void sumofNaturalNo(int i, int n, int sum) {
          if (i == n) {
               sum += i;
               System.out.println(sum);
               return;
          }
          sum += i;
          sumofNaturalNo(i + 1, n, sum);
     }

     public static void main(String[] args) {
          sumofNaturalNo(1, 5, 0);
     }
}