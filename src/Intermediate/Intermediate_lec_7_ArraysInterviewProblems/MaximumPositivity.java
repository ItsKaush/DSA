package Intermediate.Intermediate_lec_7_ArraysInterviewProblems;

public class MaximumPositivity {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int[] getMaximumPositiveSubArray(){
        //store the current count, previous count and start index
        int current_count = 0, previous_count = 0, start_index = 0;
        int n = A.length;

        //Iterate over array
        for (int i=0; i<n; i++){
            //it the current element is negative and it is greater than previous count then update the previous count and start index
            if(A[i] < 0){
                if(previous_count < current_count){
                    previous_count = current_count;
                    start_index = i - current_count;
                }
                current_count = 0;
            }

            //else If the current element in positive and it is last element then also update the start index, because in this scenario array has ended but start index is
            // still the start of previous positive subarray
            else if(A[i] > 0 && i == n-1){
                current_count++;
                if(previous_count < current_count){
                    previous_count = current_count;
                    start_index = i - current_count + 1;
                }
            }

            //else Increase current count only if above both conditions are false means current element is positive
            else{
                current_count++;
            }


        }

        //Create the resultant subarray
        int[] subArray = new int[previous_count];
        for (int j=start_index; j<(start_index+previous_count); j++) {
            subArray[j - start_index] = A[j];
        }

        return subArray;
    }
}
