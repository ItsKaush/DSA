package Intermediate.Intermediate_Lec_9_BitManipulation_2;

public class HelpFromSam {
    private int A;

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getNumberOfHelps(){
        int count = 0;
        while(A > 0){
            if((A&1) != 0){
                count++;
            }
            A >>= 1;
        }
        return count;
    }
}
