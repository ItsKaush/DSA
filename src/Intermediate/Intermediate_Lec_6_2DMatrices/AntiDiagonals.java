package Intermediate.Intermediate_Lec_6_2DMatrices;

import java.util.ArrayList;
import java.util.List;

public class AntiDiagonals {
    private int[][] A;

    public int[][] getA() {
        return A;
    }

    public void setA(int[][] a) {
        A = a;
    }

    public int[][] getAntiDiagonals(){
        //fix the 0th row and iterate over it
        int row = A.length;
        int col = A[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int j=0; j<col; j++){
            int x = 0, y = j;
            ans.add(new ArrayList<>());
            while (x<row && y>=0){
//                System.out.print(A[x][y]);
                ans.get(j).add(A[x][y]);
                x++;
                y--;
            }
//            System.out.println();
        }

        //Iterate over last column
        for (int i=1; i<row; i++){
            int x = i, y = col-1;
            ans.add(new ArrayList<>());
            while (x<row && y>=0){
//                System.out.print(A[x][y]);
                ans.get(i+row-1).add(A[x][y]);
                x++;
                y--;
            }
//            System.out.println();
        }
//        System.out.println(ans);
//        System.out.println(ans.size() + ", " + ans.get(0).size());
        int[][] ans_array = new int[ans.size()][A[0].length];
        for (int i=0; i<ans_array.length; i++){
            for (int j=0; j<ans.get(i).size(); j++){
                ans_array[i][j] = ans.get(i).get(j);
            }
        }
        return ans_array;
    }
}
