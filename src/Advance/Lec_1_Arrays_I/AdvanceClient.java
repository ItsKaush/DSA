package Advance.Lec_1_Arrays_I;

public class AdvanceClient {
    public static void main(String[] args) {
        /*
        L1_Q1
        MaxAbsDiff maxAbsDiff = new MaxAbsDiff();
        int[] A = {1};
        maxAbsDiff.setA(A);
        System.out.println(maxAbsDiff.getMaximumOfDifference());

        L1_Q2
        MaxSumContiguousSubArray maxSumContiguousSubArray = new MaxSumContiguousSubArray();
        maxSumContiguousSubArray.setA(new int[] {1, 2, 3, 4, -10});
        System.out.println(maxSumContiguousSubArray.getMaximumSum());

        L1_Q3
        ContinuousSumQuery sumQuery = new ContinuousSumQuery();
        sumQuery.setA(5);
        sumQuery.setB(new int[][] {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}});
        System.out.println(Arrays.toString(sumQuery.getAmountforEachBeggar()));

        L1_Q4
        AddOneToNumber addOneToNumber = new AddOneToNumber();
        addOneToNumber.setA(new int[] {0,0,4,4,6,0,9,6,5,1});
        System.out.println(Arrays.toString(addOneToNumber.getResult()));

        L1_Q5
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
        System.out.println(equilibriumIndex.getEquilibriumIndex(new int[] {-7, 1, 5, 2, -4, 3, 0}));
        */

        AbsoluteMaximum absoluteMaximum = new AbsoluteMaximum();
        int[] A = {1, 2, 3, 4};
        int[] B = {-1, 4, 5, 6};
        int[] C = {-10, 5, 3, -8};
        int[] D = {-1, -9, -6, -10};
        System.out.println(absoluteMaximum.getAbsoluteMaximum(A,B,C,D));




    }
}
