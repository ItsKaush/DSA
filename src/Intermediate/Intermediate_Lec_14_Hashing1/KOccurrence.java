package Intermediate.Intermediate_Lec_14_Hashing1;

import java.util.HashMap;

public class KOccurrence {
    private int A;
    private int B;
    private int[] C;

    public KOccurrence(int a, int b, int[] c) {
        A = a;
        B = b;
        C = c;
    }

    public int getSumOfElementsWithBOccurrence(){
        if(B > A) {
            return -1;
        }

        //Create freq map
        HashMap<Integer,Integer> freq_map = new HashMap<>();
        for(int num : C){
            if(freq_map.containsKey(num)){
                freq_map.put(num, freq_map.get(num) + 1);
            }else{
                freq_map.put(num, 1);
            }
        }

        //Iterate over array and check in freq map if this elements frequency is B, if yes then add to ans and remove that element from freq map
        int ans = -1;
        for(int num : C){
            if(freq_map.containsKey(num) && freq_map.get(num) == B){
                if(ans == -1){
                    ans = 0;
                }
                ans += num;
                ans %= 1000000007;
                freq_map.remove(num);
            }
        }

        return ans;
    }
}
