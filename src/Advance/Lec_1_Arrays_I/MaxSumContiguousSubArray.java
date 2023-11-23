package Advance.Lec_1_Arrays_I;

public class MaxSumContiguousSubArray {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    public int getMaximumSum(){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int j : A) {
            max_ending_here += j;

            max_so_far = Math.max(max_so_far, max_ending_here);

            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
