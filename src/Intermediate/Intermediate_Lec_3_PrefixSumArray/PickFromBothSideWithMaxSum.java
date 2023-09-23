package Intermediate.Intermediate_Lec_3_PrefixSumArray;

public class PickFromBothSideWithMaxSum {
    private int[] A;
    private int B;
    public PickFromBothSideWithMaxSum(int[] A, int B){
        this.A = A;
        this.B = B;
    }

    public int[] getPrefixSum(int[] A){
        GetPrefixSumArray gt = new GetPrefixSumArray(A);
        return gt.GetPrefixSum();
    }

    public int GetMaxFromBothSide(){
        int[] preSum = getPrefixSum(A);
        int leftSum = 0,rightSum = 0;
        long maxSum = Integer.MIN_VALUE;
        for(int i=0; i<B; i++){
            int j = B-i;
            if(i==0){
                leftSum = 0;
                rightSum = preSum[A.length-1];
            } else if (j == -1) {
                leftSum = preSum[A.length-1];
                rightSum = 0;
            } else{
                leftSum = preSum[i-1];
                rightSum = preSum[A.length-1] - preSum[A.length-1-j];
            }
            maxSum = Math.max(leftSum+rightSum,maxSum);
        }
        return (int)maxSum;
    }


}
