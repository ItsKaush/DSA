package Intermediate.Intermediate_Lec21_Subsequesnce;

public class LexicographicMinimumSubsequence {
    private String A;

    public void setA(String a) {
        A = a;
    }

    public String solve(){
        String ans = "";
        char minElement1 = 'z', minElement2 = 'z';
        int index = 0;
        for(int i=0; i<A.length()-1; i++){
            if(A.charAt(i) < minElement1){
                minElement1 = A.charAt(i);
                index = i;
            }
        }

        for(int i=index+1; i<A.length(); i++){
            if(A.charAt(i) < minElement2){
                minElement2 = A.charAt(i);
            }
        }

        return ans+minElement1+minElement2;
    }

}
