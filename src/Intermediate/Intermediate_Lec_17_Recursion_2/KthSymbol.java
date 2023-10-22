package Intermediate.Intermediate_Lec_17_Recursion_2;

public class KthSymbol {
    private int A;
    private int B;

    public KthSymbol(int a, int b) {
        A = a;
        B = b;
    }

    public int getKthSymbol(int A, int B){
        //Base Case: if A is 1 then its value is 0
        if(A == 1 || B == 1){
            return 0;
        }

        //For ith index its parent is i/2 if it is even, else parent is (i+1)/2
        int parent;
        if((B & 1) != 0){
            parent = getKthSymbol(A-1,(B+1)/2);
        }else{
            parent = getKthSymbol(A-1,B/2);
        }

        if((B & 1) == 0){
            return 1-parent;
        }else{
            return parent;
        }
    }
}
