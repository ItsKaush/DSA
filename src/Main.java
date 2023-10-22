import Intermediate.Intermediate_Lec_19_Stack.ArrayListImpl;
import Intermediate.Intermediate_Lec_19_Stack.Stack;

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

        L11_Q1
        int[] A = {1,1,1};
        MajorityElement majorityElement = new MajorityElement();
        majorityElement.setA(A);
        System.out.println(majorityElement.getMajorityElement());

        L11_Q2
        int[] A = {1,2,3,4,5};
        RepeatNumberNByThree repeatNumberNByThree = new RepeatNumberNByThree();
        repeatNumberNByThree.setA(A);
        System.out.println(repeatNumberNByThree.getMajorityElementII());

        L11_Q3
        int n = 5000;
        MagicNumber magicNumber = new MagicNumber();
        magicNumber.setN(n);
        System.out.println(magicNumber.getMagicNumber());


        L12_Q1
        int[] A = {3,1,7};
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression(A);
        System.out.println(arithmeticProgression.isArithmetic());

        L12_Q2
        int[] A = {-4,7,5,3,5,-4,2,-1,-9,-8,-3,0,9,-7,-4,-10,-4,2,6,1,-2,-3,-1,-8,0,-8,-7,-3,5,-1,-8,-8,8,-1,-3,3,6,1,-8,-1,3,-9,9,-6,7,8,-6,5,0,3,-4,1,-10,6,3,-8,0,6,-9,-5,-5,-6,-3,6,-5,-4,-1,3,7,-6,5,-8,-5,4,-3,4,-6,-7,0,-3,-2,6,8,-2,-6,-7,1,4,9,2,-10,6,-2,9,2,-4,-4,4,9,5,0,4,8,-3,-9,7,-8,7,2,2,6,-9,-10,-4,-9,-5,-1,-6,9,-10,-1,1,7,7,1,-9,5,-1,-3,-3,6,7,3,-4,-5,-4,-7,9,-6,-2,1,2,-1,-7,9,0,-2,-2,5,-10,-1,6,-7,8,-5,-4,1,-9,5,9,-2,-6,-2,-9,0,3,-10,4,-6,-6,4,-3,6,-7,1,-3,-5,9,6,2,1,7,-2,5};
        NobleInteger nobleInteger = new NobleInteger(A);
        System.out.println(nobleInteger.isNoble());

        L12_Q3
        int[] A = {0};
        SortByColor sortByColor = new SortByColor(A);
        System.out.println(Arrays.toString(sortByColor.getSortedColors()));

        L12_Q4
        int[] A = {1,2,0,3};
        ElementsRemoval elementsRemoval = new ElementsRemoval(A);
        System.out.println(elementsRemoval.getMinimumCostOfRemoval());


        L12_Q5
        int[] A = {9,99,999,9999,9998};
        LargestNumber largestNumber = new LargestNumber(A);
        System.out.println(largestNumber.getLargestNumber());

        L13_Q1
        String A = "scaler";
        SimpleReverse simpleReverse = new SimpleReverse(A);
        System.out.println(simpleReverse.reverse());

        L13_Q2
        String A = "this  word";
        ReverseTheString reverseTheString = new ReverseTheString(A);
        System.out.println(reverseTheString.getReversedString());

        L13_Q3
        char[] A = {'a','#','A','0','Z','S'};
        ConvertCase convertCase = new ConvertCase(A);
        System.out.println(Arrays.toString(convertCase.to_Lower(A)));
        System.out.println(Arrays.toString(convertCase.to_Upper(A)));
        System.out.println(convertCase.isAlphanumeric(A));

        L13_Q4
        String A = "ABCGAG";
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring(A);
        System.out.println(longestPalindromicSubstring.getLongestPalindrome());


        L13_Q5
        String[] A = {"aaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix(A);
        System.out.println(longestCommonPrefix.getLongestCommonPrefix());

        L13_Q6
        String A = "abcabbccd";
        int B = 3;
        ChangeCharacter changeCharacter = new ChangeCharacter(A,B);
        System.out.println(changeCharacter.getDistinctCharacters());

        L14_Q1
        int[] A={1, 2, 2, 1};
        int[] B={2, 3, 1, 2};
        CommonElements commonElements = new CommonElements(A,B);
        System.out.println(Arrays.toString(commonElements.getCommonElements()));

        L14_Q2
        int[] A = {10, 4, 3, 5, 6};
        FirstRepeatingElement firstRepeatingElement = new FirstRepeatingElement(A);
        System.out.println(firstRepeatingElement.getFirstOccurringElement());

        L14_Q3
        int[] A = {10,-3,-9,-10,9,-26,7,-2,-20,-19,-9,7,13,-5,-8,-24,-11,28,28,24};
        LargestContinuousSequenceZeroSum largestContinuousSequenceZeroSum = new LargestContinuousSequenceZeroSum(A);
        System.out.println(Arrays.toString(largestContinuousSequenceZeroSum.getLargestContinuousSequenceWithZeroSum()));

        L14_Q4
        int[] A = {1,2,3,4,5};
        SubArrayWithZeroSum subArrayWithZeroSum = new SubArrayWithZeroSum(A);
        System.out.println(subArrayWithZeroSum.isSUbArrayWithZeroSumPresent());

        L14_Q5
        int[] A = {7, 1, 3, 4, 1, 7};
        ShaggyAndDistance shaggyAndDistance = new ShaggyAndDistance(A);
        System.out.println(shaggyAndDistance.getMinimumDistanceBetweenRepeatingElements());

        L14_Q6
        int A = 3;
        int B = 2;
        int[] C = {0,0,2};
        KOccurrence kOccurrence = new KOccurrence(A,B,C);
        System.out.println(kOccurrence.getSumOfElementsWithBOccurrence());

        L14_Q7
        String A = "aacceeec";
        CheckPalindromeII checkPalindromeII = new CheckPalindromeII(A);
        System.out.println(checkPalindromeII.isPalindromePossible());

        L14_Q8
        int A = 23;
        ColorfulNumber colorfulNumber = new ColorfulNumber(A);
        System.out.println(colorfulNumber.isColorful());

        L15_Q1
        int[] A = {1,2,3,4,5};
        int B = 6;
        SubarrayWithGivenSum subarrayWithGivenSum = new SubarrayWithGivenSum(A,B);
        System.out.println(Arrays.toString(subarrayWithGivenSum.findSubarrayWithGivenSum()));

        L15_Q2
        int[] A = {1,5,3};
        int B = 3;
        DiffkII diffkII = new DiffkII(A,B);
        System.out.println(diffkII.isDiffPossible());

        L15_Q3
        int[] A = {1,2,3,2,4,5};
        int B = 3;
        DistinctNumberInWindow distinctNumberInWindow = new DistinctNumberInWindow(A,B);
        System.out.println(Arrays.toString(distinctNumberInWindow.getDistinctElementsInWindow()));

        L15_Q4
        int[] A = {2,7,11,15};
        int B = 9;
        TwoSum twoSum = new TwoSum(A,B);
        System.out.println(Arrays.toString(twoSum.getIndexesTwoSum()));

        L15_Q5
        String[] A = {"hello", "scaler", "interviewbit"};
        String B = "adhbcfegskjlponmirqtxwuvzy";
        ISDictionary isDictionary = new ISDictionary(A,B);
        System.out.println(isDictionary.isDictionary());

        L15_Q6
        int[] A = {3, 6, 8, 10, 15, 50};
        int B = 5;
        PairsWithGivenXor pairsWithGivenXor = new PairsWithGivenXor(A,B);
        System.out.println(pairsWithGivenXor.getPairsCountWithXorB());

        L15_Q7
        String[] A = {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
        SudokuValidator sudokuValidator = new SudokuValidator(A);
        System.out.println(sudokuValidator.isSudokuValid());

        L16_Q1
        String A = "n";
        CheckPalindrome checkPalindrome = new CheckPalindrome(A);
        System.out.println(checkPalindrome.isPalindromeMain());

        L16_Q2
        int A = 9;
        FindFibonacciII findFibonacciII = new FindFibonacciII(A);
        System.out.println(findFibonacciII.getIthNumberInFibonacci(A));

        L16_Q3
        int A = 4;
        FindFactorial findFactorial = new FindFactorial(A);
        System.out.println(findFactorial.getFactorial(A));

        L16_Q4
        int A = 321;
        SumOfDigits sumOfDigits = new SumOfDigits(A);
        System.out.println(sumOfDigits.getSum(A));

        L17_Q1
        int A = -2;
        int B = 3;
        int C = 3;
        ImplementPowerFunction powerFunction = new ImplementPowerFunction(A,B,C);
        System.out.println(powerFunction.powerFunction());

        L17_Q2
        int A = 83557;
        IsMagic magic = new IsMagic(A);
        System.out.println(magic.magic(A));

        L17_Q3
        int A = 9;
        int B = 175;
        KthSymbol kthSymbol = new KthSymbol(A,B);
        System.out.println(kthSymbol.getKthSymbol(A,B));

        L18_Q1
        LinkedList linkedList = new LinkedList();
        linkedList.insert_node(1,2);
        linkedList.insert_node(2,4);
        linkedList.insert_node(3,6);
        linkedList.insert_node(2,3);
        linkedList.insert_node(3,7);
        linkedList.insert_node(5,8);
        linkedList.insert_node(4,5);
        linkedList.insert_node(7,3);
        linkedList.print_ll();
        linkedList.delete_node(1);
        linkedList.delete_node(1);
        linkedList.delete_node(5);
        linkedList.delete_node(2);
        System.out.println();
        linkedList.print_ll();


*/
        Stack stack = new ArrayListImpl();
        stack.add(2);
        stack.add(3);
        stack.add(7);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println( stack.top());
        stack.pop();
        System.out.println(stack.top());































































    }
}