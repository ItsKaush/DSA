package Intermediate.Intermediate_Lec_12_Sorting;

import java.util.Arrays;

public class ElementsRemoval {
    private int[] A;

    public ElementsRemoval(int[] a) {
        A = a;
    }

    public int getMinimumCostOfRemoval(){
        int minimum_cost = 0;
        //sort the array
        Arrays.sort(A);

        //Iterate in array and get the total sum
        int current_cost = 0;
        for(int num : A){
            current_cost += num;
        }

        //Iterate from right to left and keep subtracting the element from current sum
        for(int i=A.length-1; i>=0; i--){
            minimum_cost += current_cost;
            current_cost -= A[i];
        }
        return minimum_cost;
    }
}
