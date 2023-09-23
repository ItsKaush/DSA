package Intermediate.Intermediate_Lec_5_Subarrays;

public class SumOfAllSubArrays {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public long getSumOfAllSubArrays(){
        long ans = 0L;
        for(int i=0; i<A.length; i++){
            long this_element_contribution = (long) A[i] * (i+1) * (A.length - i);
            ans += this_element_contribution;
        }
        return ans;
    }
}
