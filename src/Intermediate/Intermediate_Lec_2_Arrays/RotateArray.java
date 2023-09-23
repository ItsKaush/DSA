package Intermediate.Intermediate_Lec_2_Arrays;

public class RotateArray {
    private int[] A;
    private int B;

    public RotateArray (int[] A, int B){
        this.A = A;
        this.B = B;
    }

    public void GetRotatedArray(){
        //rotate the entire array
        int i = 0, j = A.length-1;
        while (i<j){
            swap(A, i, j);
            i++;
            j--;
        }

        //rotate first B elements
        B = B % A.length;
        i = 0; j = B - 1;
        while (i < j){
            swap(A, i, j);
            i++;
            j--;
        }

        //Rotate remaining elements from B to n-1;
        i = B; j = A.length-1;
        while (i < j){
            swap(A, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    //Print Array
    public void PrintArray(){
        for(int x : A){
            System.out.print(x+" ");
        }
    }


}

















