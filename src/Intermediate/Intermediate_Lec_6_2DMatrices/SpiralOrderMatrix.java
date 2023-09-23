package Intermediate.Intermediate_Lec_6_2DMatrices;

public class SpiralOrderMatrix {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getSpiralMatrixII(){
        int[][] matrix = new int[n][n];

        int start_row = 0, start_column = 0, end_row = n-1, end_column = n-1, counter = 1;


        while(counter <= n*n) {
            //Iterate from start col to end column on first row then increment first row as it has been printed
            for (int i = start_column; i <= end_column; i++) {
                matrix[start_row][i] = counter;
                counter++;
            }
            start_row++;

            //Iterate from start row to end row over last column and at the end decrement last column as last column has been printed
            for (int i = start_row; i <= end_row; i++) {
                matrix[i][end_column] = counter;
                counter++;
            }
            end_column--;

            //Iterate from last column to start column over last row and at the end decrement last row
            for (int i = end_column; i >= start_column; i--) {
                matrix[end_row][i] = counter;
                counter++;
            }
            end_row--;

            //Iterate from end row to start row over start column and at the end increment the start col
            for (int i = end_row; i >= start_row; i--) {
                matrix[i][start_column] = counter;
                counter++;
            }
            start_column++;
        }
        return matrix;
    }
}
