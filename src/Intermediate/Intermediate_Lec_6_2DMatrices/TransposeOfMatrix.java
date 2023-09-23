package Intermediate.Intermediate_Lec_6_2DMatrices;

public class TransposeOfMatrix {
    private int[][] A;

    public int[][] getA() {
        return A;
    }

    public void setA(int[][] a) {
        A = a;
    }

    public int[][] getTranspose(){
        int[][] transpose = new int[A[0].length][A.length];
        for (int i=0; i<transpose.length; i++){
            for (int j=0; j<transpose[0].length; j++){
                transpose[i][j] = A[j][i];
            }
        }
        return transpose;
    }
}
