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

        //Create a frequency map of prefix sum
        HashMap<Integer,Integer> prefix_sum_freq = new HashMap<>();
        for (int num : prefix_sum){
            if(prefix_sum_freq.containsKey(num)){
                prefix_sum_freq.put(num, prefix_sum_freq.get(num) + 1);
            }else {
                prefix_sum_freq.put(num, 1);
            }
        }

        //Get the key from map having max frequency
        int element_with_max_freq = prefix_sum[0];
        for (int num: prefix_sum_freq.keySet()){
            if(prefix_sum_freq.get(num) > prefix_sum_freq.get(element_with_max_freq)){
                element_with_max_freq = num;
            }
        }

        //iterate over prefix sum array and get the index of this element
        int start_index = -1, end_index = -1;
        for(int i=0; i<prefix_sum.length; i++){
            if(prefix_sum[i] == element_with_max_freq){
                if(start_index == -1){
                    start_index = i;
                }else {
                    end_index = i;
                }
            }
        }

        //Iterate over prefix sum array and check if its any on element is zero
        int length = end_index - start_index ;
        for(int i = 0; i<prefix_sum.length; i++){
            if(prefix_sum[i] == 0 && i+1 > length){
                start_index = -1;
                end_index = i;
                length = i + 1;
            }
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
