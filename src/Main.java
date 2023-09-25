import Intermediate.Intermediate_Lec_11_ArraysAndMaths.MajorityElement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*
        L1_Q1.
        primeNumber pm = new primeNumber(1000000);
        System.out.println(pm.GetPrime());
        L1_Q2.
        PerfectNumber pf = new PerfectNumber(4);
        System.out.println(pf.CheckPerfectNumber());
        L1_Q3.
        SquareRoot sq =new SquareRoot(12112112);
        System.out.println(sq.GetSquareRoot());
        L1_Q4
        ArmstrongNumber arn = new ArmstrongNumber(153);
        System.out.println(arn.IsArmstrongNumber());
        L2_Q1
        int[] arr = {1,2,3,4};
        RotateArray rt = new RotateArray(arr,5);
        rt.GetRotatedArray();
        rt.PrintArray();
        L2.Q2
        int[] A = {5,17,100,1};
        MaxEvenMinOddDiff diff = new MaxEvenMinOddDiff(A);
        System.out.println(diff.GetDiff());
        int[] A = {1,2,3,4,5};
        int[] B = {2,3};
        MultipleLeftRotationArray rotationArray = new MultipleLeftRotationArray(A,B);
        rotationArray.RotatedArrays();
        rotationArray.PrintArray();
        L3_Q1
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        EquilibriumIndex eq = new EquilibriumIndex(A);
        System.out.println(eq.GetEquilibriumIndex());
        L3_Q2
        int[] A = {1,1};
        SpecialIndex spi = new SpecialIndex(A);
        System.out.println(spi.GetSpecialIndexCount());
        L3_Q3
        int[] A = {5,-2,3,1,2};
        int B = 5;
        PickFromBothSideWithMaxSum p = new PickFromBothSideWithMaxSum(A,B);
        System.out.println(p.GetMaxFromBothSide());
        L3_Q4
        int[] A = {1,2,3,4,5};
        ProductArrayPuzzle pap = new ProductArrayPuzzle(A);
        System.out.println(Arrays.toString(pap.getResultArray()));
        L4_Q1
        String A = "ABCGAG";
        SpecialSubsequenceAG ss = new SpecialSubsequenceAG(A);
        System.out.println(ss.getCountOfSpecialAG());
        L4_Q2
        int[] A = {10,1,9,2,6,1,6,9,1};
        ClosestMinMax closestMinMax = new ClosestMinMax();
        closestMinMax.setA(A);
        System.out.println(closestMinMax.getClosestMinMax());
        L4_Q3
        int[] A = {0,0,0,1,1};
        Bulbs bulbs = new Bulbs();
        bulbs.setA(A);
        System.out.println(bulbs.getMinimumSwitchPressesToLightAllBulbs());
        L4_Q4
        int[] A = {5,4};
        LeadersInAnArray leadersInAnArray = new LeadersInAnArray();
        leadersInAnArray.setA(A);
        System.out.println(Arrays.toString(leadersInAnArray.getLeaders()));

        L5_Q1
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSumContiguousSubarray maxSumContiguousSubarray = new MaxSumContiguousSubarray();
        maxSumContiguousSubarray.setA(A);
        System.out.println(maxSumContiguousSubarray.getMaxSumOfContiguousSubarray());

        L5_Q2
        int[] A = {1, 2, 3};
        SumOfAllSubArrays sum = new SumOfAllSubArrays();
        sum.setA(A);
        System.out.println(sum.getSumOfAllSubArrays());

        L5_Q3
        int[] A = {3, 7, 5, 20, -10, 0, 12};
        int K = 7;
        SubarrayWithLeastAverage subarrayWithLeastAverage = new SubarrayWithLeastAverage();
        subarrayWithLeastAverage.setA(A);
        subarrayWithLeastAverage.setK(K);
        System.out.println(subarrayWithLeastAverage.getSubarrayWithLeastAverage());

        L5_Q4
        int[] A = {2, 5, 6};
        int B = 10;
        CountingSubArraysWithSumLessThanTarget countingSubArraysWithSumLessThanTarget = new CountingSubArraysWithSumLessThanTarget();
        countingSubArraysWithSumLessThanTarget.setA(A);
        countingSubArraysWithSumLessThanTarget.setB(B);
        System.out.println(countingSubArraysWithSumLessThanTarget.getCountOfSubArrayWithSumLessThanB());

        L5_Q5
        int[] A = {1,0,1,0,1};
        int B = 0;
        AlternatingSubArraysEasy alternatingSubArraysEasy = new AlternatingSubArraysEasy();
        alternatingSubArraysEasy.setA(A);
        alternatingSubArraysEasy.setB(B);
        System.out.println(Arrays.toString(alternatingSubArraysEasy.getIndexOfAlternateSubArrays()));

        L6_Q1
        int[][] A = {{1, 2, 3,},{4, 5, 6},{7, 8, 9}};
        AntiDiagonals antiDiagonals = new AntiDiagonals();
        antiDiagonals.setA(A);
        System.out.println(Arrays.deepToString(antiDiagonals.getAntiDiagonals()));

        L6_Q2
        int[][] A = {{1,2,3,4}, {5,6,7,8}, {9,2,3,4}};
        ColumnSum columnSum = new ColumnSum();
        columnSum.setA(A);
        System.out.println(Arrays.toString(columnSum.getColumnSum()));

        L6_Q3
        int[][] A ={{1,2}};
        int[][] B ={{5},{8}};
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        matrixMultiplication.setA(A);
        matrixMultiplication.setB(B);
        System.out.println(Arrays.deepToString(matrixMultiplication.getMultipliedArray()));

        L5_Q4
        int[][] A = {{1,2,3},{4,5,6}};
        TransposeOfMatrix transposeOfMatrix = new TransposeOfMatrix();
        transposeOfMatrix.setA(A);
        System.out.println(Arrays.deepToString(transposeOfMatrix.getTranspose()));

        L5_Q5
        int n = 5;
        SpiralOrderMatrix spiralOrderMatrix = new SpiralOrderMatrix();
        spiralOrderMatrix.setN(n);
        System.out.println(Arrays.deepToString(spiralOrderMatrix.getSpiralMatrixII()));

        L5_Q6
        int[][] A = {{1,2},{3,4}};
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.setA(A);
        System.out.println(Arrays.deepToString(rotateMatrix.getRotatedMatrix()));


        L5_Q7
        int[][] A = {{1,2,3,4}, {5,6,7,0}, {9,2,0,4}};
        RowToColumnZero rowToColumnZero = new RowToColumnZero();
        rowToColumnZero.setA(A);
        System.out.println(Arrays.deepToString(rowToColumnZero.getZeroMatrix()));

        L6_Q1
        String s = "111000";
        LengthOfLongestConsecutiveOnes lengthOfLongestConsecutiveOnes = new LengthOfLongestConsecutiveOnes();
        lengthOfLongestConsecutiveOnes.setS(s);
        System.out.println(lengthOfLongestConsecutiveOnes.getMaxConsecutiveOnes());

        L6_Q2
        int[] A = {1,6,4,2,6,9};
        int[] B = {2,5,7,3,2,7};
        ChristmasTrees christmasTrees = new ChristmasTrees();
        christmasTrees.setA(A);
        christmasTrees.setB(B);
        System.out.println(christmasTrees.getMinimumCost());

        L6_Q3
        int[] A = {1,4,5,7,-5,6,7,8};
        MaximumPositivity maximumPositivity = new MaximumPositivity();
        maximumPositivity.setA(A);
        System.out.println(Arrays.toString(maximumPositivity.getMaximumPositiveSubArray()));

        L6_Q4
        int n = 5;
        HollowStartPattern hollowStartPattern = new HollowStartPattern();
        hollowStartPattern.setN(n);
        hollowStartPattern.printHollowStartPattern();

        L7_Q1
        int[] A = {1,2,1,3,4,3,4};
        SingleNumber singleNumber = new SingleNumber();
        singleNumber.setNums(A);
        System.out.println(singleNumber.getSingleOccurringNumber());

        L7_Q2
        String num1 = "100";
        String num2 = "11";
        AddBinaryString addBinaryString = new AddBinaryString();
        addBinaryString.setNumber1(num1);
        addBinaryString.setNumber2(num2);
        System.out.println(addBinaryString.getSumInBinaryString());

        L7_Q3
        int n = 6;
        NumbersOf1Bits numbersOf1Bits = new NumbersOf1Bits();
        numbersOf1Bits.setN(n);
        System.out.println(numbersOf1Bits.getCountOfSetBitsWithRightShiftOperator());

        L7_Q4
        int[] A = {1};
        InterestingArray interestingArray = new InterestingArray();
        interestingArray.setA(A);
        System.out.println(interestingArray.isPossibleToConvertIntoZero());

        L7_Q5
        int n = 3;
        ReverseBits reverseBits = new ReverseBits();
        reverseBits.setNum(n);
        System.out.println(reverseBits.getNumberAfterReversingTheBits());

        L9_Q1
        int n = 8;
        HelpFromSam helpFromSam = new HelpFromSam();
        helpFromSam.setA(n);
        System.out.println(helpFromSam.getNumberOfHelps());

        L9_Q2
        int[] A = {1,2,3,2,1,4};
        TwoUniqueNumbersInArray twoUniqueNumbersInArray = new TwoUniqueNumbersInArray();
        twoUniqueNumbersInArray.setA(A);
        System.out.println(Arrays.toString(twoUniqueNumbersInArray.getTwoUniqueNumbers()));

        L9_Q3
        int[] A = {1,0,1,0,0};
        SubArraysWithBitwiseOR1 subArraysWithBitwiseOR1 = new SubArraysWithBitwiseOR1();
        subArraysWithBitwiseOR1.setA(A);
        System.out.println(subArraysWithBitwiseOR1.getSubArrayCount());

        L10_Q1
        String col = "BACAZ";
        ExcelColumnNumber excelColumnNumber = new ExcelColumnNumber();
        excelColumnNumber.setColumn(col);
        System.out.println(excelColumnNumber.getColumnNumber());

        L10_Q2
        String num = "9124";
        DivisibilityBy8 divisibilityBy8 = new DivisibilityBy8();
        divisibilityBy8.setNumber(num);
        System.out.println(divisibilityBy8.isDivisibleBy8());

        L10_Q5
        String A = "23";
        int B = 25;
        ModString modString = new ModString();
        modString.setA(A);
        modString.setB(B);
        System.out.println(modString.getAModB());

        L10_Q6
        int[] A = {1,2,3,2,5};
        RepeatAndMissingNumberArray repeatAndMissingNumberArray = new RepeatAndMissingNumberArray();
        repeatAndMissingNumberArray.setA(A);
        System.out.println(Arrays.toString(repeatAndMissingNumberArray.getNumbers()));

        L10_Q7
        OverlappingRectangles overlappingRectangles = new OverlappingRectangles(12,47,39,72,8,3,47,55);
        System.out.println(overlappingRectangles.isRectanglesOverlapping());
*/
        int[] A = {1,1,1};
        MajorityElement majorityElement = new MajorityElement();
        majorityElement.setA(A);
        System.out.println(majorityElement.getMajorityElement());

























    }
}