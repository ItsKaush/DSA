package Intermediate.Intermediate_Lec_19_Stack;

public class BalancedParenthesis {
    private String A;

    public BalancedParenthesis(String a) {
        A = a;
    }

    public int isParenthesisBalanced(){
        //store the opening parenthesis in stack
        Stack stack = new LinkedListImpl();
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '(' || A.charAt(i)=='{' || A.charAt(i) == '['){
                stack.add(A.charAt(i));
            } else if (A.charAt(i) == ')') {
                if(!stack.isEmpty() && stack.top()=='('){
                    stack.pop();
                }else{
                    return 0;
                }

            }else if (A.charAt(i) == '}') {
                if(!stack.isEmpty() && stack.top()=='{'){
                    stack.pop();
                }else{
                    return 0;
                }
            }else if (A.charAt(i) == ']') {
                if(!stack.isEmpty() && stack.top()=='['){
                    stack.pop();
                }else{
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;

    }

}
