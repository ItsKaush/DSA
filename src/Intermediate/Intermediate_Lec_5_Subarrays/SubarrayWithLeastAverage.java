package Intermediate.Intermediate_Lec_5_Subarrays;

public class SubarrayWithLeastAverage {
    private int[] A;

    public int getK() {
        return K;
    }

    public void setK(int k) {
        K = k;
    }

    private int K;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int getSubarrayWithLeastAverage(){
        //Construct a prefixArray
        int[] prefixSumArray = new int[A.length];
        prefixSumArray[0] = A[0];
        for (int i=1; i<A.length; i++){
            prefixSumArray[i] = A[i] + prefixSumArray[i-1];
        }

        //Iterate over Array till j is less than size
        int i = 0, j = K - 1, ans = -1, sum = Integer.MAX_VALUE;
        double average = 0.0;
        while (j<A.length){
            int current_sum = 0;
            if(i==0){
                current_sum = prefixSumArray[j];
            }else {
                current_sum = prefixSumArray[j] - prefixSumArray[i-1];
            }

            if(sum > current_sum){
                sum = current_sum;
                ans = i;
                average = (double) sum / K;
            }
            i++;
            j++;
        }
        return ans;
    }
}
