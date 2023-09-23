package Intermediate.Intermediate_Lec_6_2DMatrices;

public class RotateMatrix {
    public int[][] A;

    public int[][] getA() {
        return A;
    }

    public void setA(int[][] a) {
        A = a;
    }

    public int[][] getRotatedMatrix(){
        //Get the transpose
        int row = A.length;
        int col = A[0].length;
        for (int i=0; i<row; i++){
            for(int j=0; j<i; j++){ //J should be less than i, otherwise it will get swapped twice and original matrix will remain same
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        //Swap column elements
        for (int i=0; i<row; i++){
            for (int j=0; j<col/2; j++){
                int temp = A[i][j];
                A[i][j] = A[i][col-1-j];
                A[i][col-1-j] = temp;
            }
        }

        return A;
    }
}
