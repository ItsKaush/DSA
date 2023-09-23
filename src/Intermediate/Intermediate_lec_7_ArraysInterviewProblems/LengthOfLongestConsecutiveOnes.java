package Intermediate.Intermediate_lec_7_ArraysInterviewProblems;

public class LengthOfLongestConsecutiveOnes {
    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getMaxConsecutiveOnes(){
        int max = 0, total_ones = 0;
        int n = s.length();

        //Iterate Over String and get the count of consecutive ones
        for (int i=0; i<n; i++){
            if (s.charAt(i) ==  '1'){
                total_ones++;
            }
        }

        //If total ones count is equal to length of string then return length of string
        if(total_ones == n){
            return n;
        }

        //Iterate over string and get the count of left and right ones
        for (int i=0; i<n; i++){
            if(s.charAt(i) == '0'){
                //iterate on left and get the ones count in left
                int left = 0;
                for (int j=i-1; j>=0; j--){
                    if (s.charAt(j) == '1'){
                        left++;
                    }
                    else {
                        break;
                    }
                }

                //Iterate on right and get the ones count in right
                int right = 0;
                for (int j=i+1; j<n; j++){
                    if (s.charAt(j) == '1'){
                        right++;
                    }
                    else {
                        break;
                    }
                }

                //check if left plus right equal to total ones then answer will be left plus right else left plus right plus one
                if (left + right == total_ones){
                    max = Math.max(max,left + right) ;
                } else {
                    max = Math.max(max,left + right + 1) ;
                }
            }
        }

        return max;
    }
}
