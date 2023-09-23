package Intermediate.Intermediate_Lec_6_2DMatrices;

public class RowToColumnZero {
    private int[][] A;

    public int[][] getA() {
        return A;
    }

    public void setA(int[][] a) {
        A = a;
    }

    public int[][] getZeroMatrix(){
        //Iterate over each element and check if it is zero
        int row = A.length;
        int col = A[0].length;
        int[][] zero_matrix = new int[row][col];

        for (int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                zero_matrix[i][j] = A[i][j];
            }
        }

        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if (A[i][j] == 0){
                    //Make ith rows element zero
                    for (int k=0; k<col; k++){
                        zero_matrix[i][k] = 0;
                    }

                    //Make jth column element zero
                    for (int k=0; k<row; k++){
                        zero_matrix[k][j] = 0;
                    }
                }
            }
        }
        return zero_matrix;
    }
}
