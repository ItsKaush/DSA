package Intermediate.Intermediate_Lec_10_Modular_Arithmetic;

public class RepeatAndMissingNumberArray {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int[] getNumbers(){
        //Iterate over array and find the actual sum
        long actualSum = 0;
        for(int num : A){
            actualSum += num;
        }

        //Find the real Arithmetic sum
        int n = A.length;
        long realSum = (long)(n)*(n+1)/2;

        //Let say repeating element is x
        int x = 0;
        //Let say missing element is y
        int y = 0;

        //first equation will be actualSum - realSum  = x - y

        //find the sum of square of given elements
        long actualSquareSum = 0;
        for(int num : A){
            actualSquareSum += (long)num*num;
        }

        //find the sum of square of n natural numbers
        long realSquareSum = (long)(n)*(n+1)*(2L*n+1)/6;

        //second equation will be actualSquareSum - realSquareSum = x^2 - y^2
        //After solving above two equations, we will get x = ((actualSquareSum - realSquareSum)/(actualSum - realSum)+(actualSum - realSum))/2
        int repeatingNumber = (int)(((actualSquareSum - realSquareSum)/(int)(actualSum - realSum))+(int)(actualSum - realSum))/2;
        int missingNumber = (int)(repeatingNumber - actualSum + realSum);

        int[] ans = new int[2];
        ans[0] = repeatingNumber;
        ans[1] = missingNumber;

        return ans;
    }
}
