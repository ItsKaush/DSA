package Intermediate.Intermediate_Lec_5_Subarrays;

public class MaxSumContiguousSubarray {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int getMaxSumOfContiguousSubarray(){
        int max_so_far = Integer.MIN_VALUE;
        int current_max = 0;

        for (int num : A) {
            current_max += num;

            if (max_so_far < current_max) {
                max_so_far = current_max;
            }

            if (current_max < 0) {
                current_max = 0;
            }
        }
        return max_so_far;
    }
}
