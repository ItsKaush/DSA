package Intermediate.Intermediate_Lec_13_String;

public class LongestCommonPrefix {
    private String[] A;

    public LongestCommonPrefix(String[] a) {
        A = a;
    }

    public String getLongestCommonPrefix(){
        String common_prefix = A[0];
        for(int i=1; i<A.length; i++){
            String current_string = A[i];
            //will iterate over this string and check if characters of prefix are available in this string
            //Also will be iterating over the prefix string because this can be smaller than the current string or also can be greater than the current string
            //so better to find the smaller between both and iterate over that
            int n = Math.min(common_prefix.length(),current_string.length());
            for(int j=0; j<n; j++){
                //Moment the characters does not match update the prefix string and break the loop and check for next string
                if(common_prefix.charAt(j) != current_string.charAt(j)){
                    common_prefix = common_prefix.substring(0, j);
                    break;
                }
                //If all the characters of prefix string has matched with current string and current string length is smaller than prefix sum then update the prefix string
                if( (j == n-1) && (current_string.length() < common_prefix.length())){
                    common_prefix = current_string;
                }
            }
        }
        return common_prefix;
    }
}
