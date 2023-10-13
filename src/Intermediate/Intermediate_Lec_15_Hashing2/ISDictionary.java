package Intermediate.Intermediate_Lec_15_Hashing2;

import java.util.HashMap;

public class ISDictionary {
    private String[] A;
    private String B;

    public ISDictionary(String[] a, String b) {
        A = a;
        B = b;
    }

    public int isDictionary(){
        //prepare a hashmap with the index of each character in dictionary B
        HashMap<Character, Integer> dict_map = new HashMap<>();
        for(int i=0; i<B.length(); i++){
            dict_map.put(B.charAt(i), i);
        }

        //Iterate over word array, compare the first character, if same iterate the second character, if current word character index is less than previous word character index from
        //map then break else continue
        String prev_word = A[0];
        for(int i=1; i<A.length; i++){
            String curr_word = A[i];

            //Compare the index of first character of curr and prev words
            int j=0;
            while (j<prev_word.length() || j<curr_word.length()){
                //Compare the index of first character of curr and prev words, if according to dictionary break from this loop and move to next word
                if(dict_map.get(curr_word.charAt(j)) > dict_map.get(prev_word.charAt(j))){
                    break;
                }

                //If the current character is same in dictionary map then check for next characters and keep on increasing j
                else if(dict_map.get(curr_word.charAt(j)) == dict_map.get(prev_word.charAt(j))){
                    //check if end is reached then previous word length should be smaller than current word length
                    if(j==prev_word.length()-1 || j==curr_word.length()-1){
                        if(prev_word.length() > curr_word.length()){
                            return 0;
                        }
                    }
                    j++;
                }
                //reached here means current word char index is less than prev word character index hence return 0
                else{
                    return 0;
                }
            }
            prev_word = curr_word;
        }
        //If reached here means all the words are in correct order so return 1
        return 1;
    }
}
