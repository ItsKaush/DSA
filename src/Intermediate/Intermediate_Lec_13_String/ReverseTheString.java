package Intermediate.Intermediate_Lec_13_String;

public class ReverseTheString {
    private String A;

    public ReverseTheString(String a) {
        A = a;
    }

    public String getReversedString(){
        StringBuilder sb = new StringBuilder();
        //Reverse the entire string first
        for(int i=A.length()-1; i>=0; i--){
            sb.append(A.charAt(i));
        }

        //iterate on reverse string and find the space then reverse from l to r-1 where l is start index and r is end index before space
        StringBuilder sb1 = new StringBuilder();
        int l = 0, r = -1;
        for(int i=0; i<A.length(); i++){
            //find the space
            if(sb.charAt(i) == ' '){
                r = i-1;
                //reverse this word
                for(int j=r; j>=l; j--){
                    sb1.append(sb.charAt(j));
                }
                //If r is not the last element then add a space
                if(r != A.length()){
                    l = r+1;
                }
                //need to check the next character and update l
//                int temp = i;
//                while(sb.charAt(temp) == ' ' ){
//                    temp++;
//                }
//                l = temp;
            }
            if(i == A.length()-1){
                //reverse this last word
                for(int j=i; j>=l; j--){
                    sb1.append(sb.charAt(j));
                }
            }

        }
        return sb1.toString().trim();
    }

    public String reverseStringHelper(String s, int start_Index, int end_Index){
        StringBuilder sb = new StringBuilder();
        for(int i=end_Index; i>=start_Index; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
