// set the 2nd bit(Position=1) of  a number n(n=0101) 5 base 10
//(i) bitMask : 1<<i (Position)  
//(II) Operation :OR
package apnacollege.bitManipulation;

public class setBit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos; // 0010 decimal 2 base10
        System.out.println(bitMask);
        int newNumber = bitMask | n;
        System.out.println(newNumber); // 0111 decimal 7 base 10

    }
}
