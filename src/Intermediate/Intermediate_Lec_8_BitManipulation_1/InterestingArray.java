package Intermediate.Intermediate_Lec_8_BitManipulation_1;

public class InterestingArray {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    public String isPossibleToConvertIntoZero(){
        //Iterate over array and take xor
        int result = A[0];
        for (int i=1; i<A.length; i++){
            result ^= A[i];
        }

        if((result & 1)==0){
            return "Yes";
        }else {
            return "No";
        }
    }
}
