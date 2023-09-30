package Intermediate.Intermediate_Lec_11_ArraysAndMaths;

public class RepeatNumberNByThree {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int getMajorityElementII() {
        int candidate1 = -1, candidate2 = -1, count1 = 0, count2 = 0;
        //Iterate over array, if candidate 1 is -1 then assign current element to it same with candidate 2
        for (int k : A) {
            if (candidate1 == -1) {
                candidate1 = k;
                count1 = 1;
            } else if (candidate2 == -1) {
                candidate2 = k;
                count2 = 1;
            } else if (candidate1 == k) {//if current element is equal to candidate 1 then increment count 1
                count1++;
            } else if (candidate2 == k) {//If current element is equal to candidate 2 then increment count 2
                count2++;
            } else if (count1 == 1) {//If count 1 == 1 then assign current element to candidate1, because current element is not candidate1 and its count is 1 means it \
                // is no longer candidate
                candidate1 = k;
            } else if (count2 == 1) {
                candidate2 = k;
            } else {
                count1--;
                count2--;
            }
        }

        //Iterate over array find frequency of candidate 1 and candidate 2
        count1 = 0;
        count2 = 0;
        for (int j : A) {
            if (j == candidate1) {
                count1++;
            } else if (j == candidate2) {
                count2++;
            }
        }
        //If count of any of the candidate is greater than n/3 then return that candidate
        if(count1 > A.length/3){
            return candidate1;
        }else if(count2 > A.length/3){
            return candidate2;
        }
        return -1;
    }
}