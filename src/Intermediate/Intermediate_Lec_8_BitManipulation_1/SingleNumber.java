package Intermediate.Intermediate_Lec_8_BitManipulation_1;

public class SingleNumber {
    private int[] nums;

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    public int getSingleOccurringNumber(){
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}
