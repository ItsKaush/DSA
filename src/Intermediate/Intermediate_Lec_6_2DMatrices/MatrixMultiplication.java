package Intermediate.Intermediate_Lec_6_2DMatrices;

public class MatrixMultiplication {
    private int[][] A;
    private int[][] B;

    public int[][] getA() {
        return A;
    }

    public void setA(int[][] a) {
        A = a;
    }

    public int[][] getB() {
        return B;
    }

    public void setB(int[][] b) {
        B = b;
    }

    public int[][] getMultipliedArray(){
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        int[][] multiplication_array = new int[m][p];

        //Each element is  = Ai1*B1j + Ai2*B2j + .... Ain*Bnj

        //Iterate i over m
        for(int i=0; i<m; i++){
            //Iterate over p
            for (int j=0; j<p; j++){
                //iterate k over n
                for (int k=0; k<n; k++){
                    multiplication_array[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return multiplication_array;
    }
}
