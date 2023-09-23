package Intermediate.Intermediate_Lec_2_Arrays;

public class MaxEvenMinOddDiff {
    private int[] A;

    public MaxEvenMinOddDiff (int[] A){
        this.A = A;
    }

    int maxEven = Integer.MIN_VALUE, minOdd = Integer.MAX_VALUE;
    public int GetDiff(){
        for(int x : A){
            if((x&1) == 0){
                maxEven = Math.max(maxEven,x);
            }
            else{
                minOdd = Math.min(minOdd, x);
            }
        }
        return maxEven - minOdd;
    }
}
