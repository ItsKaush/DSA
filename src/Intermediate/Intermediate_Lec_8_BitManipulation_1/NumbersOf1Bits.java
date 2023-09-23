package Intermediate.Intermediate_Lec_8_BitManipulation_1;

public class NumbersOf1Bits {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    //use the left shift operator on 1 to check if the current bit is 1.
    //if num & (i<i) != 0, then ith bit is 1

    public int getCountOfSetBit(){
        int count = 0;
        int bits = 0;
        while(bits < 32){
            if((n & (1<<bits)) != 0){
                count++;
            }
            bits++;
        }
        return count;
    }

    public int getCountOfSetBitsWithRightShiftOperator(){
        int count = 0;
        while( n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

}
