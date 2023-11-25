package Advance.Lec_2_Arrays_II;

public class MinimumSwaps {
    private int[] A;
    private int B;

    public void setA(int[] a) {
        A = a;
    }

    public void setB(int b) {
        B = b;
    }

    public int getNumberOfSwaps(){
        //count the number of elements less or equal than B in array
        int window_size = 0;
        for(int num : A){
            if(num <= B){
                window_size++;
            }
        }


        //find the number of swaps required in first window
        int swap_required = 0;
        for(int i=0; i<window_size; i++){
            if(A[i] > B){
                swap_required++;
            }
        }

        System.out.println("Window size: " + window_size + "  And swaps required in first window: " + swap_required);


        //keep sliding this window till end and keep track of element removed and added and find min of swap required for each window.
        int left = 1, right = window_size;
        int ans = swap_required;
        while(left<=A.length-window_size ){
            if(A[left-1] <= B && A[right] > B){
                swap_required++;
            }else if (A[left-1] > B && A[right] <= B){
                swap_required--;
            }
            left++;
            right++;
            ans = Math.min(ans, swap_required);
        }
        return ans;
    }
}
