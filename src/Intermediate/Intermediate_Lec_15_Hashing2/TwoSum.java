package Intermediate.Intermediate_Lec_15_Hashing2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    private int[] A;
    private int B;

    public TwoSum(int[] a, int b) {
        A = a;
        B = b;
    }

    public int[] getIndexesTwoSum(){
        //Create a index hashmap
        HashMap<Integer, List<Integer>> freq_index_map = new HashMap<>();
        for(int i=0; i<A.length; i++){
            if(freq_index_map.containsKey(A[i])){
                List<Integer> list = freq_index_map.get(A[i]);
                list.add(i);
                freq_index_map.put(A[i], list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                freq_index_map.put(A[i], list);
            }
        }

        //Iterate over array and and check in hashmap, if exists then check for both condition if same element and different elements
        int first_index = -1, second_index = -1;
        for(int i=0; i<A.length; i++){
            int a = A[i];
            int b = B - a;

            //If both a and b are equal and element exists in map then corresponding list size be greater or equal than 2
            if(a == b && freq_index_map.containsKey(b) && freq_index_map.get(b).size() >= 2){
                first_index  = i;
                second_index = freq_index_map.get(b).get(1);
                break;
            }

            //If both are not equal then check if list size is greater or equal 1
            if(a != b && freq_index_map.containsKey(b) && !freq_index_map.get(b).isEmpty()){
                first_index = i;
                second_index = freq_index_map.get(b).get(0);
                break;
            }
        }
        int[] ans_array = new int[2];
        if(first_index == -1){
            return new int[] {};
        }

        ans_array[0] = first_index+1;
        ans_array[1] = second_index+1;
        return ans_array;
    }
}
