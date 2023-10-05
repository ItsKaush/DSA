package Intermediate.Intermediate_Lec_14_Hashing1;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {
    private int[] A;
    private int[] B;

    public CommonElements(int[] a, int[] b) {
        A = a;
        B = b;
    }



    public int[] getCommonElements(){
        HashMap<Integer, Integer> freq_map_A = new HashMap<>();
        //Iterate over array A and create its frequency map
        for (int j : A) {
            if (freq_map_A.containsKey(j)) {
                freq_map_A.put(j, freq_map_A.get(j) + 1);
            }else{
                freq_map_A.put(j, 1);
            }

        }

        //Iterate over second array and check if that is present in A and its frequency greater than 0, if present add that in common array and reduce frequency by 1
        ArrayList<Integer> common_elements = new ArrayList<>();
        for (int num : B){
            if(freq_map_A.containsKey(num) && freq_map_A.get(num) > 0){
                common_elements.add(num);
                freq_map_A.put(num,freq_map_A.get(num)-1);
            }
        }

        //Convert this list into array and return
        int[] common_element_array = new int[common_elements.size()];
        for (int i=0; i<common_element_array.length; i++){
            common_element_array[i] = common_elements.get(i);
        }

        return common_element_array;
    }
}
