package Advance.Lec_1_Arrays_I;

public class AbsoluteMaximum {
    private int[] A;
    private int[] B;
    private int[] C;
    private int[] D;

    public void setA(int[] a) {
        A = a;
    }

    public void setB(int[] b) {
        B = b;
    }

    public void setC(int[] c) {
        C = c;
    }

    public void setD(int[] d) {
        D = d;
    }

    public int getAbsoluteMaximum(int[] A, int[] B, int[] C, int[] D) {
        int ans = Integer.MIN_VALUE;
        //there can be 16 configuration, and for each configuration need to find the max
        for (int i = 0; i < 32; i++) {
            int max_of_this_config = Integer.MIN_VALUE;
            int min_of_this_config = Integer.MAX_VALUE;

            for (int j = 0; j < A.length; j++) {
                int current_sum = A[j];
                //for rest of 4 terms need to decide the sign whether they will be added or subtracted
                for (int k = 0; k < 4; k++) {
                    int temp = 0;
                    if (k == 0) {
                        temp = B[j];
                    } else if (k == 1) {
                        temp = C[j];
                    } else if (k == 2) {
                        temp = D[j];
                    } else if (k == 3) {
                        temp = j;
                    }

                    //Whether the current term will be added or subtracted will be decided on the basis of bits
                    if (((1 << k) & i) != 0) {
                        current_sum += temp;
                    } else {
                        current_sum -= temp;
                    }
                }
                max_of_this_config = Math.max(max_of_this_config, current_sum);
                min_of_this_config = Math.min(min_of_this_config, current_sum);

                ans = Math.max(ans, (max_of_this_config - min_of_this_config));
            }
        }
        return ans;
    }
}
