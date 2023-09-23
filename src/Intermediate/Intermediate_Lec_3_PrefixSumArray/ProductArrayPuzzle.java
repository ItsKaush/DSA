package Intermediate.Intermediate_Lec_3_PrefixSumArray;

public class ProductArrayPuzzle {
    private int[] A;

    public ProductArrayPuzzle(int[] A){
        this.A = A;
    }

    public int[] getResultArray(){
        int[] prefixProductArray = new int[A.length];
        prefixProductArray[0] = A[0];
        for (int i=1; i<A.length; i++){
            prefixProductArray[i] = prefixProductArray[i-1] * A[i];
        }

        int[] suffixProductArray = new int[A.length];
        suffixProductArray[A.length-1] = A[A.length-1];
        for (int i=A.length-2; i>0; i--){
            suffixProductArray[i] =suffixProductArray[i+1] * A[i];
        }

        int[] ResultArray = new int[A.length];
        for (int i=0; i<A.length; i++){
            if(i == 0){
                ResultArray[i] = suffixProductArray[i+1];
            } else if (i == A.length-1) {
                ResultArray[i] = prefixProductArray[i-1];
            } else {
              ResultArray[i] = prefixProductArray[i-1] * suffixProductArray[i+1];
            }
        }
        return ResultArray;
    }
}
