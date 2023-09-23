package Intermediate.Intermediate_Lec_3_PrefixSumArray;

import java.util.Arrays;

public class EquilibriumIndex {
    private int[] A;

    public EquilibriumIndex (int[] A){
        this.A = A;
    }
    //find Prefix sum from left
    public int[] GetLeftPrefixSum(int[] A){
        int[] left_Prefix_Sum = new int[A.length];
        left_Prefix_Sum[0] = A[0];
        for(int i=1; i<A.length; i++){
            left_Prefix_Sum[i] = left_Prefix_Sum[i-1] + A[i];
        }
        return left_Prefix_Sum;
    }

    public int[] GetRightPrefixSum(int[] A){
        int[] right_Prefix_Sum = new int[A.length];
        right_Prefix_Sum[right_Prefix_Sum.length-1] = A[A.length-1];
        for(int i= A.length-2; i>=0; i--){
            right_Prefix_Sum[i] = right_Prefix_Sum[i+1] + A[i];
        }
        return right_Prefix_Sum;
    }

    public int GetEquilibriumIndex(){
        System.out.println(Arrays.toString(A));
        int[] leftPSum = new int[A.length];
        leftPSum = GetLeftPrefixSum(A);
        System.out.println(Arrays.toString(leftPSum));
        int[] rightPSum = new int[A.length];
        rightPSum = GetRightPrefixSum(A);
        System.out.println(Arrays.toString(rightPSum));
        for(int i=0; i<A.length; i++){
            if(leftPSum[i] == rightPSum[i]){
                return i;
            }
        }
        return -1;
    }
}
