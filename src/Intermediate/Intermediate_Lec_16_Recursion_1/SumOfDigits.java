package Intermediate.Intermediate_Lec_16_Recursion_1;

public class SumOfDigits {
    private int A;

    public SumOfDigits(int a) {
        A = a;
    }

    public int getSum(int A){
        //Base Case: if number is zero then return number
        if(A == 0){
            return A;
        }

        return A%10 + getSum(A/10);
    }
}
