package Advance.Lec_1_Arrays_I;

public class EquilibriumIndex {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    public int getEquilibriumIndex(int[] A){
        int n = A.length;
        long[] prefix_sum_array = new long[n];
        long[] suffix_sum_array = new long[n];

        //computing prefix sum array
        prefix_sum_array[0] = A[0];
        for(int i=1; i<n; i++){
            prefix_sum_array[i] = prefix_sum_array[i-1] + A[i];
        }

        //Computing suffix sum array
        suffix_sum_array[n-1] = A[n-1];
        for(int i=n-2; i>=0; i--){
            suffix_sum_array[i] = suffix_sum_array[i+1] + A[i];
        }

        //iterate in both the array and return the index for which elements are equal;
        for(int i=0; i<n; i++){
            if(prefix_sum_array[i] == suffix_sum_array[i]){
                return i;
            }
        }

        return -1;
    }
}
