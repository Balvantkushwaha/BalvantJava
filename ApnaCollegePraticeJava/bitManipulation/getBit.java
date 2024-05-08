// 1. Get the 3rd bit (Position =2 ) of a number n(n=0101) 5 base 10 .
// approch bit Mask: 1<<i; , Operation : AND
package apnacollege.bitManipulation;

public class getBit {
      public static void main(String[] args) {
            int n = 5; // binary no. 0101
            int pos = 3;
            int bitMask = 1 << pos;
            System.out.println(bitMask);
            if ((bitMask & n) == 0) {
                  System.out.println("bit was Zero");
            } else {
                  System.out.println("bit was one");
            }

      }
}
