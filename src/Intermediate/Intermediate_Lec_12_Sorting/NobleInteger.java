package Intermediate.Intermediate_Lec_12_Sorting;

import java.util.Arrays;

public class NobleInteger {
    private int[] A;

    public NobleInteger(int[] a) {
        A = a;
    }

    public int isNoble(){
        //sort the array
        Arrays.sort(A);
        //If last element is 0 means there is no element greater than p and p is zero
        if(A[A.length-1] == 0){
            return 1;
        }
        //If array contains only single element
        if(A.length == 1){
            if(A[0] == 0){
                return 1;
            }else{
                return -1;
            }
        }
        int greater_element = A.length-1;
        //check for first element
        if((A[0] != A[1]) & (A[0] == A.length-1)){
            return 1;
        }
        //Iterate over array and check if length + 1 - i == A[i] if yes return true
        for (int i=A.length-2; i>0; i--){
            //If element is getting repeated then does not change the no of greater elements
            if(A[i+1] != A[i]){
                greater_element = A.length - i - 1;
            }
            if(greater_element == A[i]){
                return 1;
            }
        }
        return -1;
    }
}
