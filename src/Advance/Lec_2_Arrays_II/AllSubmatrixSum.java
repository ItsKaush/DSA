package Advance.Lec_2_Arrays_II;

public class AllSubmatrixSum {
    private int[][] A;

    public void setA(int[][] a) {
        A = a;
    }

    public int getSumOfAllSubMatrix(){
//        iterate over matrix and use formula for its contribution in all submatrix
        int sum = 0;
        int n = A.length;
        int m = A[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //contribution of element at i, j will be in all submatrix which starts from 0 to i and 0 to j And ends at i to n-1 and j to m-1
                sum += A[i][j] * (i+1)*(j+1) * (n-i)*(m-j);
            }
        }
        return sum;
    }
}
