package Intermediate.Intermediate_Lect_1_Basic;

public class PerfectNumber {
    private int num;

    public PerfectNumber(int num){
        this.num = num;
    }

    public String CheckPerfectNumber(){
        //A num is perfect if sum of its all divisor is equal to itself
        //number of divisors can not be more than sqrt of num
        int sum = 0;
        for(int i=1; i<Math.sqrt(num); i++){
            if(num % i == 0){
                if(i == num/i || i == 1){
                    sum += i;
                }
                else{
                    sum += (i + num/i);
                }
            }
        }

        if(sum == num){
            return "YES";
        }
        return "NO";
    }

}
