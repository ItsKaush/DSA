package Intermediate.Intermediate_Lec_12_Sorting;

import java.util.Arrays;

public class ArithmeticProgression {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public ArithmeticProgression(int[] a) {
        A = a;
    }

    public boolean isArithmetic(){
        Arrays.sort(A);
        int comm_diff = A[1]-A[0];
        for(int i=0; i<A.length-1; i++){
            if(A[i+1]-A[i] != comm_diff){
                return false;
            }
        }
        return true;
    }
}
