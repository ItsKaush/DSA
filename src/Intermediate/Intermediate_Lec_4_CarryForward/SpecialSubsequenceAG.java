package Intermediate.Intermediate_Lec_4_CarryForward;

public class SpecialSubsequenceAG {
    private String A;

    public SpecialSubsequenceAG(String A){
        this.A = A;
    }

    public int getCountOfSpecialAG(){
        int ans = 0;
        int countOfG = 0;
        for (int i=A.length()-1; i>=0; i--){
            if (A.charAt(i) == 'G'){
                countOfG++;
            } else if (A.charAt(i) == 'A') {
                ans += countOfG % 10000007;
            }
        }
        return ans%10000007;
    }

}
