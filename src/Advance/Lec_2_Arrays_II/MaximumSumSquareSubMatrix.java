package Advance.Lec_2_Arrays_II;

import java.util.Arrays;

public class MaximumSumSquareSubMatrix {
    private int[][] A;
    private int B;

    public void setA(int[][] a) {
        A = a;
    }

    public void setB(int b) {
        B = b;
    }

    public int getMaxSum(){
        int rows = A.length;
        int columns = A[0].length;
        long[][] prefix_sum_matrix = new long[rows][columns];
        //Iterate over matrix fix the top left point accordingly bottom right point and using prefix sum matrix find the sum of each submatrix and get max of all
        prefix_sum_matrix = getPrefixSumMatrix(A);
        System.out.println(Arrays.deepToString(prefix_sum_matrix));
        int ans = Integer.MIN_VALUE;
        long sum = 0;
        for(int i=0; i<=rows-B; i++){
            for(int j=0; j<=columns-B; j++){
                int x1 = i, y1 = j, x2 = i+B-1, y2 = j+B-1;
                if(x1==0 && y1==0){
                    sum = prefix_sum_matrix[x2][y2];
                } else if (x1==0) {
                    sum = prefix_sum_matrix[x2][y2] - prefix_sum_matrix[x2][y1-1];
                } else if (y1==0) {
                    sum = prefix_sum_matrix[x2][y2] - prefix_sum_matrix[x1-1][y2];
                }else {
                    sum = prefix_sum_matrix[x2][y2] - prefix_sum_matrix[x2][y1-1] - prefix_sum_matrix[x1-1][y2] + prefix_sum_matrix[x1-1][y1-1];
                }
                ans = Math.max(ans,(int)sum);
            }
        }
        return ans;
    }

    private long[][] getPrefixSumMatrix(int[][] A){
        int rows = A.length;
        int columns = A[0].length;
        long[][] prefix_sum_matrix = new long[rows][columns];
        for (int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(i==0 && j==0){
                    prefix_sum_matrix[i][j] = A[i][j];
                }else if (i==0){
                    prefix_sum_matrix[i][j] = A[i][j] + prefix_sum_matrix[i][j-1];
                }else if (j==0){
                    prefix_sum_matrix[i][j] = A[i][j] + prefix_sum_matrix[i-1][j];
                }else {
                    prefix_sum_matrix[i][j] = A[i][j] + prefix_sum_matrix[i-1][j] + prefix_sum_matrix[i][j-1] - prefix_sum_matrix[i-1][j-1];
                }
            }
        }
        return prefix_sum_matrix;
    }
}
