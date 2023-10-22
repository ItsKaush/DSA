package Intermediate.Intermediate_Lec_17_Recursion_2;

public class IsMagic {
    private int A;

    public IsMagic(int a) {
        A = a;
    }

    public int magic(int A){
        while (A > 9){
            A = getSum(A);
        }
        if(A == 1){
            return 1;
        }
        return 0;
    }

    public int getSum(int num){
        if(num == 0){
            return 0;
        }
        return num%10 + getSum(num/10);
    }
}
