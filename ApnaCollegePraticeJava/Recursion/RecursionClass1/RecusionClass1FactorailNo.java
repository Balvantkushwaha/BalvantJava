package apnacollege.Recursion.RecursionClass1;

// print factorial no. n by user . 
public class RecusionClass1FactorailNo {
    public static int factorialNo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact_nm1 = factorialNo(n - 1);
        int fact_n = n * fact_nm1;
        System.out.println(fact_n);
        return fact_n;
    }

    public static void main(String[] args) {
        int result = factorialNo(5);
        System.out.println(result);

    }
}
