package Advance.Lec_3_Arrays_III;

import java.util.Arrays;

public class RainWaterTrapped {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    public int getWaterTrapped(){
        int n = A.length;
        int[] max_right;
        max_right = getMaxRight(A);
        System.out.println(Arrays.toString(max_right));

        int ans = 0;
        int left_max = A[0];
        //Iterate from 1 to n-2 because first and last will not be able to trap any water
        for(int i=0; i<n; i++){
             left_max = Math.max(A[i], left_max);
             ans += (Math.min(left_max, max_right[i]) - A[i]);
        }
        return ans;
    }

    private int[] getMaxRight(int[] A){
        int[] right = new int[A.length];
        right[A.length-1] = A[A.length-1];
        for(int i=A.length-2; i>=0; i--){
            right[i] = Math.max(right[i+1], A[i]);
        }
        return right;
    }
}
