package Intermediate.Intermediate_Lec21_Subsequesnce;

public class OddEvenSubsequence {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    public int getCount(){
        int n = A.length;
        int count = 1;
        int even_odd_flag = 0; //element is even
        if((A[0] & 1) !=0){ //if first element is odd then make it
            even_odd_flag = 1;
        }

        for(int i=1; i<A.length; i++) {
            //if even odd flag is 0 and current element is even then increment count
            if (even_odd_flag == 0) {
                if ((A[i] & 1) != 0) {
                    count++;
                    even_odd_flag = 1;
                }
            } else if (even_odd_flag == 1) {
                if ((A[i] & 1) == 0) {
                    count++;
                    even_odd_flag = 0;
                }
            }
        }
        return count;
    }
}
