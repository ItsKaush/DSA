package Intermediate.Intermediate_Lec_5_Subarrays;

public class CountingSubArraysWithSumLessThanTarget {
    private int[] A;
    private  int B;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

//    public int getCountOfSubArrayWithSumLessThanB(){
//        int n=0, current_sum = 0, subarray_count = 0;
//        for(int i=0; i<A.length; i++){
//            current_sum += A[i];
//
//            if(current_sum < B){
//                n++;
//            }else {
//                current_sum = 0;
//            }
//
//            if(current_sum == 0 && n!=0){
//                subarray_count += n*(n+1)/2;
//                n = 0;
//            }
//        }
//        if(current_sum < B && n!=0){
//            subarray_count += n*(n+1)/2;
//        }
//        return subarray_count;
//    }

    //need to use the brute force only.
}
