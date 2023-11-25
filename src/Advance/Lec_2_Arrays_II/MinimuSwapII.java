package Advance.Lec_2_Arrays_II;

public class MinimuSwapII {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    public int getNumberOfSwaps(){
        int swap = 0;
        for(int i=0; i<A.length; i++){
            while(A[i] != i){
                //swap it with element at position A[i]
                int temp = A[i];
                A[i] = A[temp];
                A[temp] = temp;

                swap++;
            }
        }
        return swap;
    }
}
