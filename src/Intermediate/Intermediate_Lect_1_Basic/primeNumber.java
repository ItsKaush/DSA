package Intermediate.Intermediate_Lect_1_Basic;

public class primeNumber {
    private int num;

    public primeNumber(int num){
        this.num = num;
    }

    public int GetPrime(){
        for(int i=2; i<num; i++){
            if(num%i == 0) {
                return 0;
            }
        }
        return 1;
    }

}
