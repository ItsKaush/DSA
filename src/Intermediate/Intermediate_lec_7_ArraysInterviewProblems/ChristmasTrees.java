package Intermediate.Intermediate_lec_7_ArraysInterviewProblems;

public class ChristmasTrees {
    private int[] A;
    private int[] B;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int[] getB() {
        return B;
    }

    public void setB(int[] b) {
        B = b;
    }

    public int getMinimumCost(){
        int cost = Integer.MAX_VALUE;
        int n = B.length;

        //Fix the current index of B, and iterate from 1 to n-2 as the no of tress to ne selected will be 3 , so one from left and one from right
        for(int i=1; i<n-1; i++){
            //find the minimum cost from left
            int minimum_cost_left = Integer.MAX_VALUE;
            //Iterate in price tree from current index to left and find the minimum cost
            for(int j=i-1; j>=0; j--){
                //If it satisfies the tree height condition
                if(A[i] > A[j]) {
                    minimum_cost_left = Math.min(minimum_cost_left, B[j]);
                }
            }

            //If minimum cost not found in left then just continue to next iteration
            if(minimum_cost_left == Integer.MAX_VALUE){
                continue;
            }

            //Find minimum cost on right
            int minimum_cost_right = Integer.MAX_VALUE;
            //Iterate in price tree from current index to right and find the minimum cost
            for (int j=i+1; j<n; j++){
                //If it satisfies the tree height condition
                if(A[i] < A[j]){
                    minimum_cost_right = Math.min(minimum_cost_right, B[j]);
                }
            }

            //If minimum cost not found in right then just continue to next iteration
            if(minimum_cost_right == Integer.MAX_VALUE){
                continue;
            }

            //If minimum cost found in both left and right then update the cost
            cost = Math.min(cost, minimum_cost_left + B[i] + minimum_cost_right);

        }

        //If cost is still Integer.MAX_VALUE then return -1 else return cost
        return cost == Integer.MAX_VALUE ? -1 : cost;
    }
}
