package Intermediate.Intermediate_Lec_15_Hashing2;

import java.util.HashMap;

public class DistinctNumberInWindow {
    private int[] A;
    private int B;

    public DistinctNumberInWindow(int[] a, int b) {
        A = a;
        B = b;
    }

    public int[] getDistinctElementsInWindow(){
        //Create the freq map of first window
        HashMap<Integer, Integer> freq_map = new HashMap<>();
        for(int i=0; i<B; i++){
            if(freq_map.containsKey(A[i])){
                freq_map.put(A[i], freq_map.get(A[i]) + 1);
            }else{
                freq_map.put(A[i], 1);
            }
        }

        int[] distinct_element_array = new int[A.length-B+1];
        distinct_element_array[0] = freq_map.size();

        //for next windows keep removing previous and adding next
        int i = 1;
        int j = B;
        while(i <= A.length-B){
            //remove the previous element
            if(freq_map.containsKey(A[i-1])){
                freq_map.put(A[i-1], freq_map.get(A[i-1]) - 1);
            }
            if(freq_map.containsKey(A[i-1]) && freq_map.get(A[i-1]) == 0){
                freq_map.remove(A[i-1]);
            }

            //Add the j+1 element
            if(freq_map.containsKey(A[j])){
                freq_map.put(A[j], freq_map.get(A[j]) + 1);
            }else{
                freq_map.put(A[j], 1);
            }

            //add the size of map in answer array
            distinct_element_array[i] = freq_map.size();

            i++;
            j++;
        }

        return distinct_element_array;
    }
}
