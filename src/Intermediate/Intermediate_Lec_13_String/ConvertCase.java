package Intermediate.Intermediate_Lec_13_String;

public class ConvertCase {
    private char[] A;

    public ConvertCase(char[] a) {
        A = a;
    }

    public char[] to_Lower(char[] A){
        for(int i=0; i<A.length; i++){
            //Covert only if it is upper case
            if((int)A[i] >= ('A') && (int)A[i] <= 'Z'){
                A[i] += 32;
            }
        }
        return A;
    }

    public char[] to_Upper(char[] A){
        for(int i=0; i<A.length; i++){
            //Covert only if it is upper case
            if((int)A[i] >= ('a') && (int)A[i] <= 'z'){
                A[i] -= 32;
            }
        }
        return A;
    }

    public boolean isAlphanumeric(char[] A){
        for(int i=0; i<A.length; i++){
            if(((int)A[i] >= 'a' && (int)A[i] <= 'z') || ((int)A[i] >= 'A' && (int)A[i] <= 'Z') || ((int)A[i] >= '0' && (int)A[i] <= '9')){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
