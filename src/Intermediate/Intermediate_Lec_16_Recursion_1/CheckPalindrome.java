package Intermediate.Intermediate_Lec_16_Recursion_1;

public class CheckPalindrome {
    private String A;

    public CheckPalindrome(String a) {
        A = a;
        endIndex = A.length();
    }

    int startIndex = 0, endIndex;
    public int isPalindromeMain(){
        endIndex = A.length()-1;
        return isPalindrome(startIndex, endIndex);
    }
    public int isPalindrome(int startIndex, int endIndex){
        //Base Case: if reached midway then return 1
        if(startIndex >= endIndex){
            return 1;
        }

        if(A.charAt(startIndex) == A.charAt(endIndex)){
            return isPalindrome(startIndex+1, endIndex-1);
        }else{
            return 0;
        }
    }
}
