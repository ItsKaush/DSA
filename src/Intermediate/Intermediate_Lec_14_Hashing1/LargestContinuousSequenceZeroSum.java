package Intermediate.Intermediate_Lec_14_Hashing1;

import java.util.Arrays;
import java.util.HashMap;

public class LargestContinuousSequenceZeroSum {
    private int[] A;

    public LargestContinuousSequenceZeroSum(int[] a) {
        A = a;
    }

    public int[] getLargestContinuousSequenceWithZeroSum(){
        //Construct a prefix sum array
        int[] prefix_sum = new int[A.length];
        prefix_sum[0] = A[0];
        for (int i=1; i<A.length; i++){
            prefix_sum[i] = prefix_sum[i-1] + A[i];
        }

        //Check for zero element case in prefix sum array
        int start_index = -1, end_index = -1;
        int max_length = Integer.MIN_VALUE;
        for(int i=0; i<prefix_sum.length; i++){
            if(prefix_sum[i] == 0 && i-start_index>max_length){
                end_index = i;
                max_length = end_index - start_index;
            }
        }

        //Create a map and store the index of first occurrence, if this element is encountered again, check if length is greater than max length,
        // if yes update the start index and end index and max length
        HashMap<Integer,Integer> prefix_sum_index = new HashMap<>();
        for (int i=0;  i<prefix_sum.length; i++){
            if(prefix_sum_index.containsKey(prefix_sum[i])){
                if(i - prefix_sum_index.get(prefix_sum[i]) > max_length){
                    start_index = prefix_sum_index.get(prefix_sum[i]);
                    end_index = i;
                    max_length = end_index - start_index;
                }
            }else {
                prefix_sum_index.put(prefix_sum[i], i);
            }
        }

        //If no such subarray exists then return empty array
        if(end_index == -1){
            return new int[] {};
        }

        System.out.println("PresumArray: " + Arrays.toString(prefix_sum));

        //Iterate over original array and get the elements from start index +1 till index
        int[] continuous_sequence_with_zero_sum = new int[end_index-start_index];
        int current_index = 0;
        for (int i=start_index+1; i<=end_index; i++){
            continuous_sequence_with_zero_sum[current_index] = A[i];
            current_index++;
        }
        return continuous_sequence_with_zero_sum;
    }
}
