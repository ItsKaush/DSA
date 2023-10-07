package Intermediate.Intermediate_Lec_14_Hashing1;

import java.util.HashMap;

public class CheckPalindromeII {
    private String A;

    public CheckPalindromeII(String a) {
        A = a;
    }

    public int isPalindromePossible(){
        //Create freq map
        HashMap<Character,Integer> freq_map = new HashMap<>();
        for(char c : A.toCharArray()){
            if(freq_map.containsKey(c)){
                freq_map.put(c, freq_map.get(c) + 1);
            }else {
                freq_map.put(c, 1);
            }
        }

        //Iterate over freq map and check the freq
        int odd_freq_count = 0;
        for(char c : freq_map.keySet()){
            if(odd_freq_count > 1){
                return 0;
            }
            if((freq_map.get(c) & 1) != 0){
                odd_freq_count++;
            }
        }

        //Reached here means we have skipped to check for last element frequency hence will check odd freq count and return ans accordingly
        return odd_freq_count>1 ? 0 : 1;
    }
}
