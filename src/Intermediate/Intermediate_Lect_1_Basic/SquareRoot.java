package Intermediate.Intermediate_Lect_1_Basic;

public class SquareRoot {
    private int num;

    public SquareRoot (int num){
        this.num = num;
    }

    public int GetSquareRoot(){
    //Do binary search
        long s = 0, e = num;
        while(s<=e){  // s=3        e=3
            long mid = (s+e) / 2; // 4
            if(mid * mid == num){
                return (int)mid;
            }
            else if(mid * mid > num){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
}
