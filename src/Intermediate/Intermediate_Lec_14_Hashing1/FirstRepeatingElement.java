package Intermediate.Intermediate_Lec_14_Hashing1;

import java.util.HashMap;

public class FirstRepeatingElement {
    private int[] A;

    public FirstRepeatingElement(int[] a) {
        A = a;
    }

    public int getFirstOccurringElement(){
        //Create a frequency map of elements in array
        HashMap<Integer,Integer> freq_map = new HashMap<>();
        for (int num : A){
            if (freq_map.containsKey(num)){
                freq_map.put(num, freq_map.get(num)+1);
            }else{
                freq_map.put(num, 1);
            }
        }

        for (int num : A){
            if(freq_map.containsKey(num) && freq_map.get(num) > 1){
                return num;
            }
        }

        return -1;
    }
}
