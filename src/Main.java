import Intermediate.Intermediate_Lec_18_LinkedListBasics.DesignLL;

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
        int{} arr = {1,2,3,4};
        RotateArray rt = new RotateArray(arr,5);
        rt.GetRotatedArray();
        rt.PrintArray();
        L2.Q2
        int{} A = {5,17,100,1};
        MaxEvenMinOddDiff diff = new MaxEvenMinOddDiff(A);
        System.out.println(diff.GetDiff());
        int{} A = {1,2,3,4,5};
        int{} B = {2,3};
        MultipleLeftRotationArray rotationArray = new MultipleLeftRotationArray(A,B);
        rotationArray.RotatedArrays();
        rotationArray.PrintArray();
        L3_Q1
        int{} A = {-7, 1, 5, 2, -4, 3, 0};
        EquilibriumIndex eq = new EquilibriumIndex(A);
        System.out.println(eq.GetEquilibriumIndex());
        L3_Q2
        int{} A = {1,1};
        SpecialIndex spi = new SpecialIndex(A);
        System.out.println(spi.GetSpecialIndexCount());
        L3_Q3
        int{} A = {5,-2,3,1,2};
        int B = 5;
        PickFromBothSideWithMaxSum p = new PickFromBothSideWithMaxSum(A,B);
        System.out.println(p.GetMaxFromBothSide());
        L3_Q4
        int{} A = {1,2,3,4,5};
        ProductArrayPuzzle pap = new ProductArrayPuzzle(A);
        System.out.println(Arrays.toString(pap.getResultArray()));
        L4_Q1
        String A = "ABCGAG";
        SpecialSubsequenceAG ss = new SpecialSubsequenceAG(A);
        System.out.println(ss.getCountOfSpecialAG());
        L4_Q2
        int{} A = {10,1,9,2,6,1,6,9,1};
        ClosestMinMax closestMinMax = new ClosestMinMax();
        closestMinMax.setA(A);
        System.out.println(closestMinMax.getClosestMinMax());
        L4_Q3
        int{} A = {0,0,0,1,1};
        Bulbs bulbs = new Bulbs();
        bulbs.setA(A);
        System.out.println(bulbs.getMinimumSwitchPressesToLightAllBulbs());
        L4_Q4
        int{} A = {5,4};
        LeadersInAnArray leadersInAnArray = new LeadersInAnArray();
        leadersInAnArray.setA(A);
        System.out.println(Arrays.toString(leadersInAnArray.getLeaders()));

        L5_Q1
        int{} A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSumContiguousSubarray maxSumContiguousSubarray = new MaxSumContiguousSubarray();
        maxSumContiguousSubarray.setA(A);
        System.out.println(maxSumContiguousSubarray.getMaxSumOfContiguousSubarray());

        L5_Q2
        int{} A = {1, 2, 3};
        SumOfAllSubArrays sum = new SumOfAllSubArrays();
        sum.setA(A);
        System.out.println(sum.getSumOfAllSubArrays());

        L5_Q3
        int{} A = {3, 7, 5, 20, -10, 0, 12};
        int K = 7;
        SubarrayWithLeastAverage subarrayWithLeastAverage = new SubarrayWithLeastAverage();
        subarrayWithLeastAverage.setA(A);
        subarrayWithLeastAverage.setK(K);
        System.out.println(subarrayWithLeastAverage.getSubarrayWithLeastAverage());

        L5_Q4
        int{} A = {2, 5, 6};
        int B = 10;
        CountingSubArraysWithSumLessThanTarget countingSubArraysWithSumLessThanTarget = new CountingSubArraysWithSumLessThanTarget();
        countingSubArraysWithSumLessThanTarget.setA(A);
        countingSubArraysWithSumLessThanTarget.setB(B);
        System.out.println(countingSubArraysWithSumLessThanTarget.getCountOfSubArrayWithSumLessThanB());

        L5_Q5
        int{} A = {1,0,1,0,1};
        int B = 0;
        AlternatingSubArraysEasy alternatingSubArraysEasy = new AlternatingSubArraysEasy();
        alternatingSubArraysEasy.setA(A);
        alternatingSubArraysEasy.setB(B);
        System.out.println(Arrays.toString(alternatingSubArraysEasy.getIndexOfAlternateSubArrays()));

        L6_Q1
        int{}{} A = {{1, 2, 3,},{4, 5, 6},{7, 8, 9}};
        AntiDiagonals antiDiagonals = new AntiDiagonals();
        antiDiagonals.setA(A);
        System.out.println(Arrays.deepToString(antiDiagonals.getAntiDiagonals()));

        L6_Q2
        int{}{} A = {{1,2,3,4}, {5,6,7,8}, {9,2,3,4}};
        ColumnSum columnSum = new ColumnSum();
        columnSum.setA(A);
        System.out.println(Arrays.toString(columnSum.getColumnSum()));

        L6_Q3
        int{}{} A ={{1,2}};
        int{}{} B ={{5},{8}};
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        matrixMultiplication.setA(A);
        matrixMultiplication.setB(B);
        System.out.println(Arrays.deepToString(matrixMultiplication.getMultipliedArray()));

        L5_Q4
        int{}{} A = {{1,2,3},{4,5,6}};
        TransposeOfMatrix transposeOfMatrix = new TransposeOfMatrix();
        transposeOfMatrix.setA(A);
        System.out.println(Arrays.deepToString(transposeOfMatrix.getTranspose()));

        L5_Q5
        int n = 5;
        SpiralOrderMatrix spiralOrderMatrix = new SpiralOrderMatrix();
        spiralOrderMatrix.setN(n);
        System.out.println(Arrays.deepToString(spiralOrderMatrix.getSpiralMatrixII()));

        L5_Q6
        int{}{} A = {{1,2},{3,4}};
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.setA(A);
        System.out.println(Arrays.deepToString(rotateMatrix.getRotatedMatrix()));


        L5_Q7
        int{}{} A = {{1,2,3,4}, {5,6,7,0}, {9,2,0,4}};
        RowToColumnZero rowToColumnZero = new RowToColumnZero();
        rowToColumnZero.setA(A);
        System.out.println(Arrays.deepToString(rowToColumnZero.getZeroMatrix()));

        L6_Q1
        String s = "111000";
        LengthOfLongestConsecutiveOnes lengthOfLongestConsecutiveOnes = new LengthOfLongestConsecutiveOnes();
        lengthOfLongestConsecutiveOnes.setS(s);
        System.out.println(lengthOfLongestConsecutiveOnes.getMaxConsecutiveOnes());

        L6_Q2
        int{} A = {1,6,4,2,6,9};
        int{} B = {2,5,7,3,2,7};
        ChristmasTrees christmasTrees = new ChristmasTrees();
        christmasTrees.setA(A);
        christmasTrees.setB(B);
        System.out.println(christmasTrees.getMinimumCost());

        L6_Q3
        int{} A = {1,4,5,7,-5,6,7,8};
        MaximumPositivity maximumPositivity = new MaximumPositivity();
        maximumPositivity.setA(A);
        System.out.println(Arrays.toString(maximumPositivity.getMaximumPositiveSubArray()));

        L6_Q4
        int n = 5;
        HollowStartPattern hollowStartPattern = new HollowStartPattern();
        hollowStartPattern.setN(n);
        hollowStartPattern.printHollowStartPattern();

        L7_Q1
        int{} A = {1,2,1,3,4,3,4};
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
        int{} A = {1};
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
        int{} A = {1,2,3,2,1,4};
        TwoUniqueNumbersInArray twoUniqueNumbersInArray = new TwoUniqueNumbersInArray();
        twoUniqueNumbersInArray.setA(A);
        System.out.println(Arrays.toString(twoUniqueNumbersInArray.getTwoUniqueNumbers()));

        L9_Q3
        int{} A = {1,0,1,0,0};
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
        int{} A = {1,2,3,2,5};
        RepeatAndMissingNumberArray repeatAndMissingNumberArray = new RepeatAndMissingNumberArray();
        repeatAndMissingNumberArray.setA(A);
        System.out.println(Arrays.toString(repeatAndMissingNumberArray.getNumbers()));

        L10_Q7
        OverlappingRectangles overlappingRectangles = new OverlappingRectangles(12,47,39,72,8,3,47,55);
        System.out.println(overlappingRectangles.isRectanglesOverlapping());

        L11_Q1
        int{} A = {1,1,1};
        MajorityElement majorityElement = new MajorityElement();
        majorityElement.setA(A);
        System.out.println(majorityElement.getMajorityElement());

        L11_Q2
        int{} A = {1,2,3,4,5};
        RepeatNumberNByThree repeatNumberNByThree = new RepeatNumberNByThree();
        repeatNumberNByThree.setA(A);
        System.out.println(repeatNumberNByThree.getMajorityElementII());

        L11_Q3
        int n = 5000;
        MagicNumber magicNumber = new MagicNumber();
        magicNumber.setN(n);
        System.out.println(magicNumber.getMagicNumber());


        L12_Q1
        int{} A = {3,1,7};
        ArithmeticProgression arithmeticProgression = new ArithmeticProgression(A);
        System.out.println(arithmeticProgression.isArithmetic());

        L12_Q2
        int{} A = {-4,7,5,3,5,-4,2,-1,-9,-8,-3,0,9,-7,-4,-10,-4,2,6,1,-2,-3,-1,-8,0,-8,-7,-3,5,-1,-8,-8,8,-1,-3,3,6,1,-8,-1,3,-9,9,-6,7,8,-6,5,0,3,-4,1,-10,6,3,-8,0,6,-9,-5,-5,-6,-3,6,-5,-4,-1,3,7,-6,5,-8,-5,4,-3,4,-6,-7,0,-3,-2,6,8,-2,-6,-7,1,4,9,2,-10,6,-2,9,2,-4,-4,4,9,5,0,4,8,-3,-9,7,-8,7,2,2,6,-9,-10,-4,-9,-5,-1,-6,9,-10,-1,1,7,7,1,-9,5,-1,-3,-3,6,7,3,-4,-5,-4,-7,9,-6,-2,1,2,-1,-7,9,0,-2,-2,5,-10,-1,6,-7,8,-5,-4,1,-9,5,9,-2,-6,-2,-9,0,3,-10,4,-6,-6,4,-3,6,-7,1,-3,-5,9,6,2,1,7,-2,5};
        NobleInteger nobleInteger = new NobleInteger(A);
        System.out.println(nobleInteger.isNoble());

        L12_Q3
        int{} A = {0};
        SortByColor sortByColor = new SortByColor(A);
        System.out.println(Arrays.toString(sortByColor.getSortedColors()));

        L12_Q4
        int{} A = {1,2,0,3};
        ElementsRemoval elementsRemoval = new ElementsRemoval(A);
        System.out.println(elementsRemoval.getMinimumCostOfRemoval());


        L12_Q5
        int{} A = {9,99,999,9999,9998};
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
        char{} A = {'a','#','A','0','Z','S'};
        ConvertCase convertCase = new ConvertCase(A);
        System.out.println(Arrays.toString(convertCase.to_Lower(A)));
        System.out.println(Arrays.toString(convertCase.to_Upper(A)));
        System.out.println(convertCase.isAlphanumeric(A));

        L13_Q4
        String A = "ABCGAG";
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring(A);
        System.out.println(longestPalindromicSubstring.getLongestPalindrome());


        L13_Q5
        String{} A = {"aaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
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
        int{} A={1, 2, 2, 1};
        int{} B={2, 3, 1, 2};
        CommonElements commonElements = new CommonElements(A,B);
        System.out.println(Arrays.toString(commonElements.getCommonElements()));

        L14_Q2
        int{} A = {10, 4, 3, 5, 6};
        FirstRepeatingElement firstRepeatingElement = new FirstRepeatingElement(A);
        System.out.println(firstRepeatingElement.getFirstOccurringElement());

        L14_Q3
        int{} A = {10,-3,-9,-10,9,-26,7,-2,-20,-19,-9,7,13,-5,-8,-24,-11,28,28,24};
        LargestContinuousSequenceZeroSum largestContinuousSequenceZeroSum = new LargestContinuousSequenceZeroSum(A);
        System.out.println(Arrays.toString(largestContinuousSequenceZeroSum.getLargestContinuousSequenceWithZeroSum()));

        L14_Q4
        int{} A = {1,2,3,4,5};
        SubArrayWithZeroSum subArrayWithZeroSum = new SubArrayWithZeroSum(A);
        System.out.println(subArrayWithZeroSum.isSUbArrayWithZeroSumPresent());

        L14_Q5
        int{} A = {7, 1, 3, 4, 1, 7};
        ShaggyAndDistance shaggyAndDistance = new ShaggyAndDistance(A);
        System.out.println(shaggyAndDistance.getMinimumDistanceBetweenRepeatingElements());

        L14_Q6
        int A = 3;
        int B = 2;
        int{} C = {0,0,2};
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
        int{} A = {1,2,3,4,5};
        int B = 6;
        SubarrayWithGivenSum subarrayWithGivenSum = new SubarrayWithGivenSum(A,B);
        System.out.println(Arrays.toString(subarrayWithGivenSum.findSubarrayWithGivenSum()));

        L15_Q2
        int{} A = {1,5,3};
        int B = 3;
        DiffkII diffkII = new DiffkII(A,B);
        System.out.println(diffkII.isDiffPossible());

        L15_Q3
        int{} A = {1,2,3,2,4,5};
        int B = 3;
        DistinctNumberInWindow distinctNumberInWindow = new DistinctNumberInWindow(A,B);
        System.out.println(Arrays.toString(distinctNumberInWindow.getDistinctElementsInWindow()));

        L15_Q4
        int{} A = {2,7,11,15};
        int B = 9;
        TwoSum twoSum = new TwoSum(A,B);
        System.out.println(Arrays.toString(twoSum.getIndexesTwoSum()));

        L15_Q5
        String{} A = {"hello", "scaler", "interviewbit"};
        String B = "adhbcfegskjlponmirqtxwuvzy";
        ISDictionary isDictionary = new ISDictionary(A,B);
        System.out.println(isDictionary.isDictionary());

        L15_Q6
        int{} A = {3, 6, 8, 10, 15, 50};
        int B = 5;
        PairsWithGivenXor pairsWithGivenXor = new PairsWithGivenXor(A,B);
        System.out.println(pairsWithGivenXor.getPairsCountWithXorB());

        L15_Q7
        String{} A = {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
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

        L18_Q2
        Stack stack = new ArrayListImpl();
        stack.add(2);
        stack.add(3);
        stack.add(7);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println( stack.top());
        stack.pop();
        System.out.println(stack.top());

        L21_Q1
        LexicographicMinimumSubsequence lx = new LexicographicMinimumSubsequence();
        lx.setA("ksdjgha");
        System.out.println(lx.solve());

        L21_Q2
        SubarrayORSum sum = new SubarrayORSum();
        sum.setA(new int{}{347148,221001,394957,729925,276769,40726,552988,29952,184491,146773,418965,307,219145,183037,178111,81123,109199,683929,422034,346291,11434,7327,340473,316152,364005,359269,170935,105784,224044,22563,48561,165781,9329,357681,169473,175031,605611,374501,6607,329965,76068,836137,103041,486817,195549,107317,34399,56907,37477,189690,36796,376663,39721,177563,174179,183646,217729,408031,429122,631665,282941,526797,262186,306571,63613,57501,70685,226381,1338,9360,130360,20300,400906,87823,180349,108813,18181,119185,1,102611,63591,12889,311185,383896,8701,76077,75481,386017,153553,304913,383455,105948,142885,1,12610,137005,119185,16948,66171,123683});
        System.out.println(sum.solve());

        L21_Q3
        AllSubsets sets = new AllSubsets();
        sets.setA(new int{}{3,2,1});
        System.out.println(Arrays.deepToString(sets.solve()));

        L21_Q4
        OddEvenSubsequence oddEvenSubsequence = new OddEvenSubsequence();
        oddEvenSubsequence.setA(new int{}{1,2,2,3,4});
        System.out.println(oddEvenSubsequence.getCount());

        L21_Q5
        SpecialSubsequenceAG ss = new SpecialSubsequenceAG();
        ss.setA("ABCGAG");
        System.out.println(ss.getCount());

        L21_Q6
        FindSubsequence subsequence = new FindSubsequence();
        subsequence.setA("abcs");
        subsequence.setB("ahgbdc");
        System.out.println(subsequence.isAAvilableInB());

        L21_Q7
        SubsequenceSum subsequenceSum = new SubsequenceSum();
        subsequenceSum.setA(new int{}{1,2,3,4,5});
        subsequenceSum.setB(5);
        System.out.println(subsequenceSum.isSubsequenceSumEquqlBAvailable());

        L21_Q8
        SumtheDifferenceOfSubsequence sum = new SumtheDifferenceOfSubsequence();
        sum.setA(new int{}{5,10,3,5,8,9,4,4,1,5,5,10,8,7,5,8,5,8,8,7,3,3,4,1,1,1,6,8,1,7,2,7,9,7,1,8,7,7,1,9,1,5,9,10,3,5,9,8,4,6,6,8,1,9,9,3,1,4,10,4,2,3,10,10,1,1,7,10,7,9,8,9,4,6,8,8,2,6,7,5,4,3,3,6,3,1,8,6,6,9,9,
                7,3,8,9,4,10,7,3,8,6,2,6,1,8,5,8,1,3,5,6,8,9,8,3,3,10,2,8,7,10,6,3,4,6,3,7,5,10,1,5,5,3,10,5,2,7,4,2,1,8,9,8,8,8,2,1,9,5,8,5,4,6,10,7,1,2,6,7,3,8,1,7,2,3,3,5,9,7,9,1,6,7,10,4,7,1,6,5,7,3,10,10,10,9,8,
                2,2,5,9,5,3,9,3,6,3,6,1,3,4,9,3,1,7,2,6,3,4,1,8,10,6,7,1,5,7,1,7,10,5,7,4,9,7,9,5,10,4,7,2,9,5,7,9,1,8,5,6,4,5,3,3,2,1,6,7,9,6,5,8,2,1,4,1,7,4,7,6,7,3,10,7,9,6,7,1,5,3,6,8,10,10,3,1,2,8,7,10,5,1,10,6,3,5
                ,8,10,8,6,5,6,10,4,4,8,1,10,1,6,3,6,3,4,8,7,4,9,4,3,1,10,5,10,8,8,6,5,7,3,3,3,10,2,9,3,2,9,2,2,6,6,9,9,9,6,5,3,7,1,7,7,2,1,8,9,8,3,6,6,5,8,9,4,1,7,6,2,7,9,3,3,5,2,3,5,9,9,9,5,1,5,3,3,6,10,3,5,2,8,1,8,7,9,3,
                8,7,10,1,5,9,4,7,5,7,1,9,7,10,8,4,2,4,6,4,9,6,7,4,7,6,4,5,5,4,9,2,10,9,2,6,7,7,5,1,5,5,1,4,6,10,7,8,4,4,3,4,9,1,7,8,7,2,4,1,5,2,4,6,10,7,4,6,6,8,8,2,2,1,5,10,2,3,9,5,7,1,1,5,2,7,4,10,1,7,2,7,9,7,5,10,5,8,8,
                10,5,7,4,8,7,10,9,9,3,7,5,9,8,5,5,1,4,1,2,6,7,5,2,7,3,8,7,7,7,6,9,3,2,2,1,1,3,1,1,5,8,5,5,7,2,2,7,7,2,10,2,10,4,5,7,6,3,5,4,9,10,2,2,3,5,4,3,8,4,3,4,3,8,9,9,1,2,5,7,3,6,10,2,9,4,10,6,8,6,10,7,7,3,10,10,8,5,
                2,7,8,7,10,3,6,8,1,6,9,8,4,3,3,3,7,4,8,8,9,6,4,10,4,2,5,3,1,2,7,5,10,6,1,9,8,6,9,9,3,9,8,6,2,10,10,10,5,7,7,6,2,10,5,5,2,9,7,4,2,5,10,1,3,10,2,2,7,10,2,9,8,9,6,1,9,5,10,3,2,7,8,3,8,5,10,1,5,8,7,9,3,6,1,7,6,2
                ,8,4,3,10,5,1,8,10,3,8,7,3,3,8,9,10,2,8,6,1,9,3,1,5,1,3,10,1,1,7,5,8,3,7,7,7,9,5,8,2,2,4,6,4,1,6,6,5,3,3,7,3,5,7,9,5,1,1,8,1,7,2,9,1,10,7,7,9,1,5,2,5,8,9,10,1,4,7,7,6,10,3,1,4,2,9,1,2,9,10,5,8,1,5,8,2,1,5,
                2,2,1,5,8,10,3,7,10,6,6,6,4,5,1,4,10,2,4,2,3,3,1,9,2,3,3,9,7,4,5,8,7,7,3,4,7,5,2,6,3,7,4,8,3,4,1,5,5,6,8,9,10,9,8,1,3,2,10,9,5,6,9,1,3,1,6,9,7,8,6,1,6,9,8,1,4,10,7,8,6,4,9,5,4,8,6,7,9,7,7,4,4,5,6,6,7,2,6,6,
                1,2,6,8,2,4,8,6,5,6,3,10,10,3,7,3,10,4});
        System.out.println(sum.gteSumOfDifference());
 */
        DesignLL ll = new DesignLL();
        int[][] A = {{1,13,-1},{1,9,-1},{1,18,-1},{2,14,2},{1,5,-1},{1,10,-1},{0,9,-1},{3,4,-1}
                ,{3,3,-1},{1,2,-1},{1,6,-1},{2,8,4},{1,13,-1},{3,7,-1},{2,3,0}
                ,{2,12,8},{1,2,-1},{3,8,-1},{2,2,6},{0,10,-1},{1,13,-1},{0,9,-1}
                ,{2,17,13},{1,10,-1},{0,7,-1},{2,9,17},{1,8,-1},{1,20,-1},{3,7,-1},{1,19,-1}
                ,{3,3,-1},{2,14,15},{2,4,8},{1,15,-1},{1,6,-1},{2,8,1},{0,5,-1},{3,6,-1},{3,11,-1},{2,18,23},{3,20,-1},{3,5,-1},{2,13,6},{3,19,-1},{0,20,-1},
                {1,5,-1},{3,4,-1},{1,13,-1},{2,11,5},{2,8,23},{1,13,-1},{3,2,-1},{2,12,6},{0,11,-1},{2,11,25},{1,3,-1},{2,11,29},{2,6,6},{0,18,-1},{2,11,29},{3,0,-1},
                {3,21,-1},{0,11,-1},{0,10,-1},{2,15,21},{1,7,-1},{1,1,-1},{3,8,-1},{0,1,-1},{0,3,-1},{0,13,-1},{2,1,0},{0,3,-1},{1,3,-1},{0,19,-1},{2,15,6},{3,41,-1},{2,3,23},
                {1,6,-1},{1,13,-1},{1,16,-1},{1,6,-1},{3,11,-1}
        };

//        int[][]  A = {{1,13,-1}
//                    ,{2,4,1}
//                ,{1,9,-1},
//                {1,18,-1},
//                {2,3,1},
//                {0,2,-1},
//                {2,5,4},
//                {2,0,0},
//                {2,-1,6}
//                ,{2,7,3}
//                ,{2,-2,9}
//                ,{3,0,-1}
//                ,{3,1,-1}
//        }
//        ;
        ll.setA(A);
        ll.solve();
        ll.print_ll();









































































    }
}