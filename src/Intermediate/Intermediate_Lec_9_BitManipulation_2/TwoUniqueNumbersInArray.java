package Intermediate.Intermediate_Lec_9_BitManipulation_2;

public class TwoUniqueNumbersInArray {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int[] getTwoUniqueNumbers(){
        //First find teh XOR result of all the numbers, It will contain the XOR of two unique numbers
        int xor_result = 0;
        for (int num : A){
            xor_result ^= num;
        }
        //Now find the rightmost set bit in the xor_result
        int rightmost_set_bit = 0;
        for(int i=0; i<32; i++){
            if((xor_result & (1<<i)) != 0){
                rightmost_set_bit = i;
                break;
            }
        }

        //one of the required numbers will have the rightmost_set_bit as 1 and the other will have it as 0
        //Iterate over array and take xor with first num if its rightmost_set_bit is 1
        //and with second num if its rightmost_set_bit is 0
        int num1=0, num2=0;
        for(int i=0; i<A.length; i++){
            if((A[i] &(1 << rightmost_set_bit)) != 0){
                num1 ^= A[i];
            }
            else{
                num2 ^= A[i];
            }
        }

        int[] result = new int[2];
        if(num1<num2){
            result[0] = num1;
            result[1] = num2;
        }else{
            result[0] = num2;
            result[1] = num1;
        }

        return result;
    }
}
