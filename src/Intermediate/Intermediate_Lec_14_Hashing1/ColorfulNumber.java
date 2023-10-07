package Intermediate.Intermediate_Lec_14_Hashing1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ColorfulNumber {
    private int A;

    public ColorfulNumber(int a) {
        A = a;
    }

    public int isColorful(){
        //TO iterate over number need to convert it into array
        List<Integer> num_list = new ArrayList<>();
        String s = Integer.toString(A);
        for (int i=0; i<s.length(); i++){
            num_list.add((int)s.charAt(i) - (int)'0');
        }
        //store the product in hashset
        HashSet<Long> product_set = new HashSet<>();
        for(int i=0; i<num_list.size(); i++){
            for (int j=i; j<num_list.size(); j++){
                long product = 1;
                for(int k=i; k<=j; k++){
                    product *= num_list.get(k);
                }
                product_set.add(product);
            }
        }

        return product_set.size() == (s.length()*(s.length()+1)/2) ? 1 : 0;
    }
}
