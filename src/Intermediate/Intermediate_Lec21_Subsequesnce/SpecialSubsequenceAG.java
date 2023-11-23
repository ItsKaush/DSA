package Intermediate.Intermediate_Lec21_Subsequesnce;

public class SpecialSubsequenceAG {
    private String A;

    public void setA(String a) {
        A = a;
    }

    public int getCount(){
        int n = A.length();
        int count = 0;
        int count_of_g = 0;
        for(int i=n-1; i>=0; i--){
            //if G is found then increment count_of_g
            if(A.charAt(i) == 'G'){
                count_of_g++;
            } else if(A.charAt(i) == 'A'){
                //if A is found then add count_of_g to count
                count += count_of_g;
            }
        }
        return count;
    }
}
