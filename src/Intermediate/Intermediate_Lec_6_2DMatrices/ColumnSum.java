package Intermediate.Intermediate_Lec_6_2DMatrices;

public class ColumnSum {
    private int[][] A;

    public int[][] getA() {
        return A;
    }

    public void setA(int[][] a) {
        A = a;
    }

    public int[] getColumnSum(){
        int[] column_sum = new int[A[0].length];

        //Iterate over column
        for (int j=0; j<A[0].length; j++){
            int sum = 0;
            for (int i=0; i<A.length; i++){
                sum += A[i][j];
                column_sum[j] = sum;
            }
        }
        return column_sum;
    }
}
