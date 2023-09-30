package Intermediate.Intermediate_Lec_11_ArraysAndMaths;

public class MagicNumber {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    //n = 2
    public int getMagicNumber(){
        //If n equals 1 return 5
        if(n == 1){
            return 5;
        }
        int ans = 0;
        //keep iterating till number is greater than 0
        while(n > 0){ //2
            //find power of 2 such that it is less than n
            int power = 1; // 1
            int powerOfTwo = 2; // 1
            while(powerOfTwo <= n){ // 2
                powerOfTwo *= 2; //4
                power++;// 2
            }
            //coming out of inner loop means found the power of 2 less than number
            //update the answer and subtract power of two / 2 from answer, because it has becomes double in last iteration when loop condition violated
            ans += Math.pow(5,power);
            n -= powerOfTwo/2;
        }
        return ans;
    }

}
