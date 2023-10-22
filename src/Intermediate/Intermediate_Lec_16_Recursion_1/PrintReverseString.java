package Intermediate.Intermediate_Lec_16_Recursion_1;

import java.util.Scanner;

public class PrintReverseString {

    public static void reverse(String A, int n){
        if(n == -1){
            return;
        }

        System.out.print(A.charAt(n));
        reverse(A, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        reverse(A,A.length()-1);

    }
}
