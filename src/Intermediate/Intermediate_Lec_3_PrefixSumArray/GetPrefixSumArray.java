package Intermediate.Intermediate_Lec_3_PrefixSumArray;

public class GetPrefixSumArray {
    private int[] A;
    public GetPrefixSumArray(int[] A){
        this.A = A;
    }

    public int[] GetPrefixSum(){
        int preSum[] = new int[A.length];
        preSum[0] = A[0];
        for(int i=1; i<A.length; i++){
            preSum[i] = preSum[i-1] + A[i];
        }
        return preSum;
    }

}
