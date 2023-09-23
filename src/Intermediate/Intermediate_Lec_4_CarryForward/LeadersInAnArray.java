package Intermediate.Intermediate_Lec_4_CarryForward;

import java.util.ArrayList;

public class LeadersInAnArray {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int[] getLeaders(){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(A[A.length-1]);
        int count = 1;
        int max_element_SoFar = A[A.length-1];
        for (int i= A.length-2; i>=0; i--){
            if (A[i] > max_element_SoFar){
                max_element_SoFar = A[i];
                ans.add(max_element_SoFar);
                count++;
            }
        }
        //Covert ArrayList to Array
        int[] ansArray = new int[ans.size()];
        for(int i=0; i<ansArray.length; i++){
            ansArray[i] = ans.get(i);
        }
        return ansArray;
    }

}
