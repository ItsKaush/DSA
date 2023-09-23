package Intermediate.Intermediate_Lec_10_Modular_Arithmetic;

public class ModString {
    private String A;
    private int B;

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getAModB(){
        int ans = 0;
        for(int i=0; i<A.length(); i++){
            int digit = Integer.parseInt(String.valueOf(A.charAt(i)));
            System.out.println("curr digit: " + digit);
            ans = ((ans*10)%B  + digit%B) % B;
        }
        return ans;
    }
}
