package Intermediate.Intermediate_Lec_17_Recursion_2;

public class ImplementPowerFunction {
    private int A;
    private int B;
    private int C;

    public ImplementPowerFunction(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    public int powerFunction(){
        int ans = getPower(A,B,C);
        return ans<0 ? ans+C : ans;
     }
    public int getPower(int A, int B, int C){
        //Base Case: when power is zero return 1
        if(B == 0){
            return 1;
        }

        //Main logic:  find A ^ B/2 and return its square if B is even else return square of it * A
        long pow = getPower(A,B/2,C);
        if((B&1) == 0){
            return (int) (pow%C * pow%C) % C;
        }else {
            return (int) (A * (pow%C * pow%C)) % C;
        }
    }
}
