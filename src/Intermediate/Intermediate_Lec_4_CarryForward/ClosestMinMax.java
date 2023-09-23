package Intermediate.Intermediate_Lec_4_CarryForward;

public class ClosestMinMax {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int getClosestMinMax(){
        int min_Val = Integer.MAX_VALUE;
        int max_Val = Integer.MIN_VALUE;

        //Iterate over array and get the min and max
        for (int x : A){
            max_Val = Math.max(x,max_Val);
            min_Val = Math.min(x,min_Val);
        }


        //if min and max are same then and will be 1.
        if(min_Val == max_Val){
            return 1;
        }

        //Iterate over array and keep record of min val index and max val index
        int min_Val_Index = -1, max_Val_Index = -1;
        int ans = Integer.MAX_VALUE;
        for (int i=0; i<A.length; i++){
            if (A[i] == min_Val){
                min_Val_Index = i;
                if (max_Val_Index != -1){
                    ans = Math.min(ans, (Math.abs(max_Val_Index-min_Val_Index)+1));
                }
            }
            if (A[i] == max_Val){
                max_Val_Index = i;
                if (min_Val_Index != -1){
                    ans = Math.min(ans,(Math.abs(max_Val_Index-min_Val_Index)+1));
                }
            }
        }
        return ans;
    }
}
