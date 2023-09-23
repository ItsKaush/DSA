package Intermediate.Intermediate_Lec_2_Arrays;

import java.util.Arrays;

public class MultipleLeftRotationArray {
    private int[] A;
    private int[] B;

    private final int[][] ans;
    public MultipleLeftRotationArray(int[] A, int[] B){
        this.A = A;
        this.B = B;
        ans = new int[B.length][A.length];
    }
    //Each element of contains no of times the array A needs to be rotated

    public void RotatedArrays(){
        for(int i=0; i<B.length; i++){
            int k = B[i] % A.length;
            for(int j=0; j<A.length; j++){
                ans[i][j] = A[(j+k)%A.length];
            }
        }
    }

    public void PrintArray(){
        System.out.println(Arrays.deepToString(ans));
    }


}
