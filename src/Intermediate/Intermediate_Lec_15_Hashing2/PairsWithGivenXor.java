package Intermediate.Intermediate_Lec_15_Hashing2;

import java.util.HashMap;

public class PairsWithGivenXor {
    private int[] A;
    private int B;

    public PairsWithGivenXor(int[] a, int b) {
        A = a;
        B = b;
    }

    public int getPairsCountWithXorB(){
        int count =0;
        // Prepare a frequency hashmap
        HashMap<Integer,Integer> freq_map = new HashMap<>();
        for(int num : A){
            if(freq_map.containsKey(num)){
                freq_map.put(num,freq_map.get(num) + 1);
            }else{
                freq_map.put(num, 1);
            }
        }

        //Iterate over array and checkin b = A[i] xor B present in map
        for(int i=0; i<A.length; i++){
            int b = A[i] ^ B;
            if(freq_map.containsKey(b)){
                count++;
                //Reduce the frequency of both A[i] and b
                freq_map.put(b, freq_map.get(b) - 1);
                if(freq_map.get(b) == 0){
                    freq_map.remove(b);
                }
                if(freq_map.containsKey(A[i])){
                    freq_map.put(A[i], freq_map.get(A[i]) - 1);
                    if(freq_map.get(A[i]) == 0){
                        freq_map.remove(A[i]);
                    }
                }
            }
        }
        return count;
    }
}
