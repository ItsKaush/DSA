package Intermediate.Intermediate_Lect_1_Basic;

public class ArmstrongNumber {
    private int num;

    public ArmstrongNumber (int num){
        this.num = num;
    }

    public String IsArmstrongNumber(){
        int sum = 0;
        int orig_num = num;
        while(num > 0){
            if(num < 10){
                sum += GetCube(num);
            }
            else{
                sum += GetCube(num%10);
            }
            num = num / 10;
        }
        if(sum == orig_num){
            return "YES";
        }
        return "NO";
    }

    public int GetCube(int n){
        return (n*n*n);
    }



}
