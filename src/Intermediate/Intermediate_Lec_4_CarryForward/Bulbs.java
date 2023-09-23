package Intermediate.Intermediate_Lec_4_CarryForward;

public class Bulbs {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int getMinimumSwitchPressesToLightAllBulbs(){
        int count = 0;
        for (int j : A) {
            int state = j;
            //if count is even means state is same as original array state
            if ((count & 1) == 0) {
                state = j;
            } else {
                state = 1 - j;
            }

            //If state is 0 then need switch on increase the count
            if (state == 0) {
                count++;
            }
        }
        return count;
    }
}
