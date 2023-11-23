package Advance.Lec_1_Arrays_I;

public class AddOneToNumber {
    private int[] A;

    public void setA(int[] a) {
        A = a;
    }

    public int[] getResult(){
        int zero_at_start = 0;
        for(int i=0; i<A.length; i++){
            if(A[i] == 0){
                zero_at_start++;
            }else{
                break;
            }
        }

        if(zero_at_start == A.length){
            return new int[] {1};
        }

        System.out.println("Count of zeros: " + zero_at_start);

        //add the array element in ans array after removing the trailing zeros
        int[] ans_array = new int[A.length-zero_at_start];
        for(int i=0; i<ans_array.length; i++){
            ans_array[i] = A[zero_at_start+i];
        }

        //Iterate over ans array and check if the last element iz 9
        for(int i=ans_array.length-1; i>=0; i--){
            //If not 9 then increment it and return the answer
            if(ans_array[i] != 9){
                ans_array[i]++;
                return ans_array;
            }

            //If found 9 means need to set that element 0
            ans_array[i] = 0;
        }

        //Reached here means still ans is not returned, means all the elements in given array are zero
        int[] new_ans = new int[ans_array.length+1];
        new_ans[0] = 1;
        return new_ans;
    }
}
