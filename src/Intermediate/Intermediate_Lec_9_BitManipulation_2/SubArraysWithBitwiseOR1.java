package Intermediate.Intermediate_Lec_9_BitManipulation_2;

public class SubArraysWithBitwiseOR1 {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public long getSubArrayCount(){
        //find the total numbers of subarrays
        long n = A.length;
        long total_subarrays = (n*(n+1))/2;

        //Iterate over array and count zeros, if next element is 1 then subtract the contribution of zero in total subarray
        long count_zero = 0;
        for(int i=0; i<n; i++){
            if(A[i] == 0){
                count_zero++;
            } else if (A[i] == 1 && count_zero != 0) {
                total_subarrays -= (count_zero*(count_zero+1))/2;
                count_zero = 0;
            }

            //if last element is encountered and count_zero is not zero then subtract the contribution of zero in total subarray
            if(i == n-1 && count_zero != 0){
                total_subarrays -= (count_zero*(count_zero+1))/2;
            }
        }
        return total_subarrays;
    }
}
