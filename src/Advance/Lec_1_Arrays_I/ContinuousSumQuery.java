package Advance.Lec_1_Arrays_I;

public class ContinuousSumQuery {
    private int A;
    private int[][] B;

    public void setB(int[][] b) {
        B = b;
    }

    public void setA(int a) {
        A = a;
    }

    public int[] getAmountforEachBeggar(){
        int[] beggars_array = new int[A];

        //Iterate over array and add the amount at start index and subtract the amount from right+1 index
        for(int i=0; i<B.length; i++){
            int l = B[i][0];
            int r = B[i][1];
            int amount = B[i][2];

            beggars_array[l-1] += amount;

            //need to subtract from right of last beggar
            if(r < beggars_array.length){
                beggars_array[r] -= amount;
            }
        }

        int[] amount_array = new int[A];
        amount_array[0] = beggars_array[0];
        for(int i=1; i<beggars_array.length; i++){
            amount_array[i] = amount_array[i-1] + beggars_array[i];
        }

        return amount_array;
    }
}
