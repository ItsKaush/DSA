package Advance.Lec_2_Arrays_II;

public class SpiralOrderMatrix {
    private int A;

    public void setA(int a) {
        A = a;
    }

    public int[][] getSpiralMatrix(){
        int[][] matrix = new int[A][A];
        int start_row = 0, start_column = 0, end_row = A-1, end_column = A-1;
        int element = 1;
        while(start_row<=end_row && start_column<=end_column){

//            fix first row and iterate over column
            for(int j=start_column; j<=end_column; j++){
                matrix[start_row][j] = element;
                element++;
            }
            start_row++;

            //fix last column and iterate over row
            for(int j=start_row; j<=end_row; j++){
                matrix[j][end_column] = element;
                element++;
            }
            end_column--;

            //fist last row and iterate over colum
            for(int j=end_column; j>=start_column; j--){
                matrix[end_row][j] = element;
                element++;
            }
            end_row--;

            //fix the first column and iterate over rows
            for(int j=end_row; j>=start_row; j--){
                matrix[j][start_column] = element;
                element++;
            }
            start_column++;

        }

        return matrix;
    }
}
