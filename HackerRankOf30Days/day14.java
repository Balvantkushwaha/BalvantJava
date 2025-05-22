package HackerRankOf30Days;

import java.util.Scanner;

public class day14 {
    public int maxDifference(int[] elements){
        int smallest =101;
        int largest =0;
        for(int i=0;i<elements.length;i++){
            if(elements[i]>largest){
                largest = elements[i];
            }
            if(elements[i]<smallest){
                smallest = elements[i];
            }
        }
        return largest-smallest;
      }
    
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        day14 s = new day14();
        System.out.println(s.maxDifference(arr));

    }
}

