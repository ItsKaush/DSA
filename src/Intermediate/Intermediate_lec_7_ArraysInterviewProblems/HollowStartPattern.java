package Intermediate.Intermediate_lec_7_ArraysInterviewProblems;

public class HollowStartPattern {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public  void printHollowStartPattern(){
        //print upper half first
        //In ith row print n-i-1 start first then 2i spaces then print n-i-1 stars
        for (int i=0; i<n; i++){
            //print first n-i-1 stars
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }

            //Print spaces
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }

            //Print last stars upto n-i-1
            for (int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Print bottom diamond
        //in ith row there are i+1 star at start and end, then n-2i-2 spaces
        for(int i=0; i<n; i++){
            //print first i+1 stars
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }

            //Print n-2i-2 spaces
            for(int j=0; j<2*(n-i-1); j++){
                System.out.print(" ");
            }

            //Print i+1 star at end
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
