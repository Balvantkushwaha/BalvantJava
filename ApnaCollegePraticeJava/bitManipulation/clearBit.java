package apnacollege.bitManipulation;

// Q . clear the 3rd bit (postion =2 ) of a number n (n=0101) decimal 5 base10
// BitMask : 1<<i; position
// Operator : AND with NOT 
public class clearBit {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;
        System.out.println(bitMask);// 0100 decimal no. 4 base1o

        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber); // 0001
    }
}
