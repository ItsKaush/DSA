package Intermediate.Intermediate_Lec_16_Recursion_1;

public class FindFibonacciII {
    private int A;

    public FindFibonacciII(int a) {
        A = a;
    }

    public int getIthNumberInFibonacci(int A){
        if(A == 0){
            return 0;
        }
        if(A == 1){
            return 1;
        }

        return getIthNumberInFibonacci(A-1) + getIthNumberInFibonacci(A-2);
    }
}
