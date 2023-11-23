package Intermediate.Intermediate_Lec21_Subsequesnce;

public class SubsequenceSum {
    private int[] A;
    private int B;

    public void setA(int[] a) {
        A = a;
    }

    public void setB(int b) {
        B = b;
    }

    public boolean isSubsequenceSumEquqlBAvailable(){
        int n = A.length;
        int sum = 0;
        for(int i=0; i<(1 << n); i++){
            sum = 0;
            for(int j=0; j<n; j++){
                if((i & (1 << j)) != 0){
                    sum += A[j];
                }
            }
            if(sum == B){
                return true;
            }
        }
        return false;
    }
}
