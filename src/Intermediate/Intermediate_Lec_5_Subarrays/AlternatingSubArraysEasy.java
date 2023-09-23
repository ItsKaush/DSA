package Intermediate.Intermediate_Lec_5_Subarrays;

import java.util.ArrayList;
import java.util.List;

public class AlternatingSubArraysEasy {
    private int[] A;
    private int B;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int[] getIndexOfAlternateSubArrays(){
        List<Integer> index_array = new ArrayList<>();
          //  0  1  2  3  4
        //A: [1, 0, 1, 0, 1] B: 1
        //       i
        //start iterating from B index
        for(int i=B; i<A.length-B; i++){
            //iterate on left till B
            int counter = 0; // 0 1
            int status = A[i]; // 0
            int j = i; // 0
            int k = i; // 2
            while (counter <= B){
                if(A[j] == status && A[k] == status){
                    j--;
                    k++;
                    status = 1 - status;
                    counter++;
                }else{
                    break;
                }
            }
            if(counter == B+1){
                index_array.add(i);
            }
        }
        int[] ans = new int[index_array.size()];
        for (int i=0; i<ans.length; i++){
            ans[i] = index_array.get(i);
        }
        return ans;
    }
}
