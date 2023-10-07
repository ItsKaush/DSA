package Intermediate.Intermediate_Lec_14_Hashing1;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    private int[] A;

    public SubArrayWithZeroSum(int[] a) {
        A = a;
    }

    public int isSUbArrayWithZeroSumPresent(){
        //construct prefix sum array
        long[] prefix_sum_array = new long[A.length];
        prefix_sum_array[0] = A[0];
        if(prefix_sum_array[0] == 0L){
            return 1;
        }
        for(int i=1; i<prefix_sum_array.length; i++){
            prefix_sum_array[i] = prefix_sum_array[i-1] + A[i];
            if(prefix_sum_array[i] == 0L){
                return 1;
            }
        }

        //Construct a hashset and if length of hashset is less than prefix sum array length, then any of the element is repeating and hence the required subarray exists
        HashSet<Long> set = new HashSet<>();
        for (Long num : prefix_sum_array){
            set.add(num);
        }

        if(set.size() < prefix_sum_array.length){
            return 1;
        }

        return 0;
    }
}
