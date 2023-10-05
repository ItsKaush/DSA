package Intermediate.Intermediate_Lec_13_String;

public class LongestPalindromicSubstring {
    private String A;

    public LongestPalindromicSubstring(String a) {
        A = a;
    }

    public String getLongestPalindrome(){
        int max_length = Integer.MIN_VALUE;
        int l = 0, r = 0;
        int start_index = 0, end_index = 0;
        for(int i=0; i<A.length(); i++){
            //fix the centre
            l = i;
            r = i;
            //CHeck till the left and right are equal
            while (l>=0 && r<A.length() && A.charAt(l) == A.charAt(r)){
                l--;
                r++;
            }
            //Once came out means l and r are not equal so we need to check the length and update the start and end index
            if(max_length < (r-l-1)){
                max_length = r-l-1;
                start_index = l + 1;
                end_index = r - 1;
            }

            //Now fix the centre as i and i+1
            l = i;
            r = i+1;
            while(l>=0 && r<A.length() && A.charAt(l) == A.charAt(r)){
                l--;
                r++;
            }
            if(max_length < (r - l -1)){
                max_length = r - l - 1;
                start_index = l + 1;
                end_index = r - 1;
            }
        }

        return A.substring(start_index, end_index+1);
    }
}
