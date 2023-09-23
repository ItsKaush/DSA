package Intermediate.Intermediate_Lec_8_BitManipulation_1;

public class ReverseBits {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long getNumberAfterReversingTheBits(){
        long result = 0;
        //Iterate over all the bits
        for(int i=0; i<32; i++){
            long temp = 0;
            //check if current bit is set
            if(((num>>i) & 1) == 1){
                //set the 32-ith bit in temp, this will reverse the bits
                temp = (temp|1) << (31-i);
            }
            //Or operator will copy all teh set bits in result
            result = result | temp;
        }
        return result;
    }
}
