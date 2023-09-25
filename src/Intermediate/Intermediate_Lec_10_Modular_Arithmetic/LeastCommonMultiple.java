package Intermediate.Intermediate_Lec_10_Modular_Arithmetic;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void getLCM(int A, int B){
        int max = Math.max(A,B);
        int min = Math.min(A,B);
        int remainder = max;
        while(remainder > 0){
            remainder = max % min;
            max = min;
            min = remainder;
        }
        System.out.println( (A*B)/max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        for(int i=0; i<test_cases; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            getLCM(A,B);
        }
    }
}
