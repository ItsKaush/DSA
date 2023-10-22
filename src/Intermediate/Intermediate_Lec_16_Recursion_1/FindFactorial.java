package Intermediate.Intermediate_Lec_16_Recursion_1;

public class FindFactorial {
    private int A;

    public FindFactorial(int a) {
        A = a;
    }

    public int getFactorial(int A){
        if(A == 0 || A == 1){
            return 1;
        }
        return (A * getFactorial(A-1));
    }
}
