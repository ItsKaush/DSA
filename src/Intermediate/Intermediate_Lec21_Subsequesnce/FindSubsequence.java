package Intermediate.Intermediate_Lec21_Subsequesnce;

public class FindSubsequence {
    private String A;
    private String B;

    public void setA(String a) {
        A = a;
    }

    public void setB(String b) {
        B = b;
    }

    public String isAAvilableInB(){
        int n = A.length();
        int m = B.length();
        int i=0, j=0;
        while(n > 0){
            char ch = A.charAt(i);
            while(m > 0){
                if(A.charAt(i) == B.charAt(j)){
                    i++;
                    j++;
                    n--;
                    m--;
                    break;
                }else{
                    j++;
                    m--;
                }
            }
            if(n==0){
                return "Yes";
            }
            if(m==0){
                return "No";
            }
        }
        return "Yes";
    }
}
