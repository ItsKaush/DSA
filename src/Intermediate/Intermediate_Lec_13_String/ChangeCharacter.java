package Intermediate.Intermediate_Lec_13_String;

import java.util.Arrays;

public class ChangeCharacter {
    private String A;
    private int B;

    public ChangeCharacter(String a, int b) {
        A = a;
        B = b;
    }

    public int getDistinctCharacters(){
        //Edge case: if length is 1 return 1
        if (A.length() == 1){
            return 1;
        }

        //Find the frequency of each character
        int[] freq_array = new int[26];
        for(int i=0; i<A.length(); i++){
            freq_array[(int) A.charAt(i) - (int)'a'] += 1;
        }

        //Sort the frequency in ascending order
        Arrays.sort(freq_array);

        int distinct_char = 0;

        //iterate in freq array, if freq is less than B then make it zero and update B
        for(int i=0; i<freq_array.length; i++){
            if(B==0){
                break;
            }
            if(freq_array[i] <= B){
               B -= freq_array[i];
               freq_array[i] = 0;
            }
        }

        //Iterate over array and find the elements with value more than 0
        for(int num : freq_array){
            if(num != 0){
                distinct_char++;
            }
        }

        return distinct_char;
    }
}
