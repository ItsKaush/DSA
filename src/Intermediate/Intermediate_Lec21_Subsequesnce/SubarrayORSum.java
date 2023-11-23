package Intermediate.Intermediate_Lec21_Subsequesnce;

public class SubarrayORSum {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    //iterate over array
    public int solve(){
        long n = A.length;
        long ans = 0;
        long total_subarrays = (n * (n+1)) / 2;
        //Iterate for each bit position
        for(int i=0; i<32; i++){
            long num_of_subarrays_with_ith_bit_set = getNumOfSubarraysWithIthBitSet(total_subarrays, n, i);
            if(num_of_subarrays_with_ith_bit_set != total_subarrays){
                ans = (ans + ((long) (Math.pow(2,i) * (num_of_subarrays_with_ith_bit_set))) % 1000000007) % 1000000007;
            }
        }
        return (int)ans % 1000000007;
    }

    private long getNumOfSubarraysWithIthBitSet(long total_subarrays, long n, int i) {
        long count = 0;
        long num_of_subarrays_with_ith_bit_set = total_subarrays;
        for(int j = 0; j< n; j++){
            if((A[j] & (1 << i)) == 0){
                count++;
            } else {
                num_of_subarrays_with_ith_bit_set -= (count * (count+1)) / 2;
                count = 0;
            }
        }
        //If last bit is zero means it has not been reduced from the num_of_subarrays_with_ith_bit_set
        if(count != 0){
            num_of_subarrays_with_ith_bit_set -= (count * (count+1)) / 2;
        }
        return num_of_subarrays_with_ith_bit_set;
    }
}
