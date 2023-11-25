package Advance.Lec_2_Arrays_II;

public class ArraysIIClient {
    public static void main(String[] args) {
        /*
        L2_Q1
        AllSubmatrixSum allSubmatrixSum = new AllSubmatrixSum();
        allSubmatrixSum.setA(new int[][] {{1,2},{3,4}});
        System.out.println(allSubmatrixSum.getSumOfAllSubMatrix());

        L2_Q2
        SubMatrixSumQueries subMatrixSumQueries = new SubMatrixSumQueries();
        subMatrixSumQueries.setA(new int[][] {{5,17,100,11},{0,0,2,8}});
        subMatrixSumQueries.setB(new int[] {1,1});
        subMatrixSumQueries.setC(new int[] {1,4});
        subMatrixSumQueries.setD(new int[] {2,2});
        subMatrixSumQueries.setE(new int[] {2,4});
        System.out.println(Arrays.toString(subMatrixSumQueries.getSumOfEachQuery()));

        MaximumSumSquareSubMatrix maximumSumSquareSubMatrix = new MaximumSumSquareSubMatrix();
        maximumSumSquareSubMatrix.setA(new int[][] {
                {1, 1, 1, 1, 1},
        {2, 2, 2, 2, 2},
        {3, 8, 6, 7, 3},
        {4, 4, 4, 4, 4},
        {5, 5, 5, 5, 5}
     });
        maximumSumSquareSubMatrix.setB(3);
        System.out.println(maximumSumSquareSubMatrix.getMaxSum());

        L2_Q4
        SpiralOrderMatrix spiralOrderMatrix = new SpiralOrderMatrix();
        spiralOrderMatrix.setA(3);
        System.out.println(Arrays.deepToString(spiralOrderMatrix.getSpiralMatrix()));


        L2_Q5
        MinimumSwaps swaps = new MinimumSwaps();
        swaps.setA(new int[] {52,7,93,47,68,26,51,44,5,41,88,19,78,38,17,13,24,74,92,5,84,27,48,49,37,
                59,3,56,79,26,55,60,16,83,63,40,55,9,96,29,7,22,27,74,78,38,11,65,29,52,36,21,94,46,52,
                47,87,33,87,70});
        swaps.setB(19);
        System.out.println(swaps.getNumberOfSwaps());
         */

        MinimuSwapII swapII = new MinimuSwapII();
        swapII.setA(new int[] {1,2,3,4,0});
        System.out.println(swapII.getNumberOfSwaps());




    }
}
