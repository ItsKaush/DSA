package Intermediate.Intermediate_Lec_13_String;

public class SimpleReverse {
    private String A;

    public SimpleReverse(String a) {
        A = a;
    }

    public String reverse(){
        StringBuilder sb = new StringBuilder();
        int l = 0, r = A.length()-1;
        for(int i=A.length()-1; i>=0; i--){
            sb.append(A.charAt(i));
        }
        return sb.toString();
    }
}
