package Intermediate.Intermediate_Lec_15_Hashing2;

import java.util.HashSet;

public class SudokuValidator {
    private String[] A;

    public SudokuValidator(String[] a) {
        A = a;
    }

    public int isSudokuValid(){
        //Create a Hashset and store key as row/col/grid + value + number from sudoku
        HashSet<String> hs = new HashSet<>();
        for (int i=0; i<A.length; i++){
            for (int j=0; j<A[0].length(); j++){
                //check for row and col make key such that it will be duplicate if numbers repeated in any row or col or box
                if(A[i].charAt(j) != '.'){
                    if(!hs.add("Row"+i+A[i].charAt(j)) || !hs.add("Col"+j+A[i].charAt(j))){
                        return 0;
                    }
                    //check for grid
                    if(!hs.add("Grid"+(i/3)*3 + j/3+A[i].charAt(j))){
                        return 0;
                    }
                }
            }
        }

        return 1;
    }
}

























