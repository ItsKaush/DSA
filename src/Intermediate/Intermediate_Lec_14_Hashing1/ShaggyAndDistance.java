package Intermediate.Intermediate_Lec_14_Hashing1;

import java.util.HashMap;

public class ShaggyAndDistance {
    private int[] A;

    public ShaggyAndDistance(int[] a) {
        A = a;
    }

    public int getMinimumDistanceBetweenRepeatingElements(){
        //construct a map and store the index of first occurrence
        HashMap<Integer, Integer> occurrence_map = new HashMap<>();
        int minimum_length = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
            if(occurrence_map.containsKey(A[i])){
                //element has encountered again so check for the length and store the minimum
                minimum_length = Math.min(minimum_length, (i-occurrence_map.get(A[i])) );
            }else{
                occurrence_map.put(A[i], i);
            }
        }
        return minimum_length==Integer.MAX_VALUE ? -1 : minimum_length;
    }
}
