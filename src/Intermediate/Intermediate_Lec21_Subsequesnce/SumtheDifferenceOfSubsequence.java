package Intermediate.Intermediate_Lec21_Subsequesnce;

public class SumtheDifferenceOfSubsequence {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    public int gteSumOfDifference(){
        //generate all the subsequence
        int n = A.length;
        System.out.println("size: " + n);
        int sum = 0;
        for(int i=1; i<(1<<n); i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum_of_difference = 0;
            for(int j=0; j<32; j++){
                if((i & (1<<j)) != 0){
                    max = Math.max(max, A[j]);
                    min = Math.min(min, A[j]);
                }
            }
            if(max != Integer.MIN_VALUE && min != Integer.MAX_VALUE){
                sum_of_difference = max - min;
            }
            sum =  ((sum % 1000000007) + (sum_of_difference)) % 1000000007;
        }
        return sum;
    }
}
