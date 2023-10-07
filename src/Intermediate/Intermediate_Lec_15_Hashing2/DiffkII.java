package Intermediate.Intermediate_Lec_15_Hashing2;

import java.util.HashMap;

public class DiffkII {
    private int[] A;
    private int B;

    public DiffkII(int[] a, int b) {
        A = a;
        B = b;
    }

    public int isDiffPossible(){
        //create a frequency hashmap
        HashMap<Integer,Integer> freq_map = new HashMap<>();
        for(int num : A){
            if(freq_map.containsKey(num)){
                freq_map.put(num, freq_map.get(num) + 1);
            }else{
                freq_map.put(num, 1);
            }
        }

        //Iterate over array and for each element check if B+A[i] present in array
        for(int i=0; i<A.length; i++){
            int a = A[i];
            int b = B + a;
            //If both a and b are equal then the frequency of this element in map should be greater or equal than 2
            if(a == b && freq_map.containsKey(b) && freq_map.get(b)>=2){
                return 1;
            }

            //If a and b are not equal then frequency of b should be greater or equal than 1
            if(a != b && freq_map.containsKey(b) && freq_map.get(b) >= 1){
                return 1;
            }
        }

        //Reached here means such indexes do not exist
        return 0;
    }
}
