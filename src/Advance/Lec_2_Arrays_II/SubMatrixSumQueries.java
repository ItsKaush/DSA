package Advance.Lec_2_Arrays_II;

import java.util.Arrays;

public class SubMatrixSumQueries {
    private int[][] A;
    private int[] B;
    private int[] C;
    private int[] D;
    private int[] E;

    public void setA(int[][] a) {
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

    public void setE(int[] e) {
        E = e;
    }

    public int[] getSumOfEachQuery(){
        int number_of_queries = B.length;
        int[] ans = new int[number_of_queries];
        //Prepare the prefix sum matrix
        int rows = A.length;
        int columns = A[0].length;
        long[][] prefix_sum_matrix = new long[rows][columns];
        prefix_sum_matrix = getPrefixSumMatrix(A);

        System.out.println(Arrays.deepToString(prefix_sum_matrix));

        //Iterate over each query and using prefix sum matrix find the sum of each submatrix
        for(int i=0; i<number_of_queries; i++){
            //top left x1--> rows y1--> columns
            int x1 = B[i]-1, y1 = C[i]-1, x2 = D[i]-1, y2 = E[i]-1;
            //handle edge cases like if top left at start then no need to subtract
            System.out.println("top left: (" + x1 +", "+ y1 +")  bottom right: (" + x2 + ", "+ y2 + ")");
            if(x1 == 0 & y1 == 0){
                ans[i] = (int)prefix_sum_matrix[x2][y2] % 1000000007;
            } else if (x1 == 0) {  //If x1 or y1 are zero then -1 will lead to out of bound exception
                ans[i] = (int) (prefix_sum_matrix[x2][y2] - prefix_sum_matrix[x2][y1-1]) % 1000000007;
            } else if (y1 == 0) {
                ans[i] = (int)(prefix_sum_matrix[x2][y2] - prefix_sum_matrix[x1-1][y2]) % 1000000007;
            }else{
                ans[i] = (int)((prefix_sum_matrix[x2][y2] - prefix_sum_matrix[x1-1][y2] - prefix_sum_matrix[x2][y1-1])% 1000000007 + (prefix_sum_matrix[x1-1][y1-1])% 1000000007)% 1000000007;
            }

        }
        return ans;
    }

    private long[][] getPrefixSumMatrix(int [][] A){
        int rows = A.length;
        int columns = A[0].length;
        long[][] prefix_sum_matrix = new long[rows][columns];
        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                if(i==0 & j ==0){
                    prefix_sum_matrix[i][j] = A[i][j];
                }else if(i==0){
                    prefix_sum_matrix[i][j] = (A[i][j] + prefix_sum_matrix[i][j-1] % 1000000007) % 1000000007;
                } else if (j==0) {
                    prefix_sum_matrix[i][j] = (A[i][j] + prefix_sum_matrix[i-1][j] % 1000000007) % 1000000007;
                }else{
                    prefix_sum_matrix[i][j] = (A[i][j] + (prefix_sum_matrix[i-1][j]% 1000000007 + prefix_sum_matrix[i][j-1]% 1000000007 - prefix_sum_matrix[i-1][j-1]% 1000000007))% 1000000007;
                }
            }
        }
        return prefix_sum_matrix;
    }
}
