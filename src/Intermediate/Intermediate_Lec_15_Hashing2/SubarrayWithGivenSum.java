package Intermediate.Intermediate_Lec_15_Hashing2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubarrayWithGivenSum {
    private int[] A;

    private int B;

    public SubarrayWithGivenSum(int[] a, int b) {
        A = a;
        B = b;
    }

    public int[] findSubarrayWithGivenSum(){
        //prepare prefix sum array
        long[] prefix_sum = new long[A.length];
        prefix_sum[0] = A[0];
        for(int i=1; i<prefix_sum.length; i++){
            prefix_sum[i] = prefix_sum[i-1] + A[i];
        }
        System.out.println(Arrays.toString(prefix_sum));

        //prepare index map of prefix sum
        HashMap<Long,Integer> index_map = new HashMap<>();
        for (int i=0; i<prefix_sum.length; i++){
            index_map.put(prefix_sum[i], i);
        }

        //Iterate over prefix sum and check if B or for each element in prefix sum B + element is present in freq map
        int start_index = -1, end_index = -1;
        for(int i=0; i<prefix_sum.length; i++){
            if(i==0 && index_map.containsKey((long)B)){
                end_index = index_map.get((long)B);
                break;
            }
            long a = prefix_sum[i];
            long b = B + a;
            if(index_map.containsKey(b)){
                start_index = i;
                end_index = index_map.get(b);
                break;
            }
        }
        List<Integer> ans_list = new ArrayList<>();
        System.out.println("Start Index: " + start_index + "/n End Index: " + end_index);
        if(end_index == -1){
            return new int[] {-1};
        }

        for (int i=start_index+1; i<=end_index; i++){
            ans_list.add(A[i]);
        }

        int[] ans_array = new int[ans_list.size()];
        for (int i=0; i<ans_array.length; i++){
            ans_array[i] = ans_list.get(i);
        }

        return ans_array;
    }
}
