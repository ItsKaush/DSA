package Intermediate.Intermediate_Lec_3_PrefixSumArray;

import java.util.Arrays;

public class SpecialIndex {
    private int[] A;

    public SpecialIndex(int[] A){
        this.A = A;
    }

    public int[] GetPrefixEvenIndexSum(int[] A){
        int[] even_Prefix_Sum = new int[A.length];
        even_Prefix_Sum[0] = A[0];
        for(int i=1; i<A.length; i++){
            if((i&1) == 0){
                even_Prefix_Sum[i] = even_Prefix_Sum[i-1] + A[i];
            }
            else{
                even_Prefix_Sum[i] = even_Prefix_Sum[i-1];
            }

        }
        return even_Prefix_Sum;
    }

    public int[] GetPrefixOddIndexSum(int[] A){
        int[] odd_Prefix_Sum = new int[A.length];
        odd_Prefix_Sum[0] = 0;
        for(int i=1; i<A.length; i++){
            if((i&1) == 0){
                odd_Prefix_Sum[i] = odd_Prefix_Sum[i-1];
            }
            else{
                odd_Prefix_Sum[i] = odd_Prefix_Sum[i-1] + A[i];
            }

        }
        return odd_Prefix_Sum;
    }

    public int GetSpecialIndexCount(){
        System.out.println(Arrays.toString(A));
        int[] even_Index_Sum = new int[A.length];
        even_Index_Sum = GetPrefixEvenIndexSum(A);
        System.out.println(Arrays.toString(even_Index_Sum));
        int[] odd_Index_Sum = new int[A.length];
        odd_Index_Sum = GetPrefixOddIndexSum(A);
        System.out.println(Arrays.toString(odd_Index_Sum));
        int specialIndexCount = 0;

        int evenSum = 0, oddSum = 0;
        for(int i=0; i<A.length; i++){
           if (i == 0){
                evenSum = odd_Index_Sum[A.length-1] - odd_Index_Sum[i];
                oddSum = even_Index_Sum[A.length-1] - even_Index_Sum[i];

           } else if (i== A.length-1) {
               oddSum = odd_Index_Sum[i-1];
               evenSum = even_Index_Sum[i-1];

           }
           else {
               evenSum = even_Index_Sum[i-1] + odd_Index_Sum[A.length-1] - odd_Index_Sum[i];
               oddSum = odd_Index_Sum[i-1] + even_Index_Sum[A.length-1] - even_Index_Sum[i];

           }
            if(evenSum == oddSum){
                specialIndexCount++;
            }
        }
        return specialIndexCount;
    }
}
