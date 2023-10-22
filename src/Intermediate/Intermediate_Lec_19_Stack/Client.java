package Intermediate.Intermediate_Lec_19_Stack;

public class Client {
    public static void main(String[] args) {
//        Stack stack = new LinkedListImpl();
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.size());
////        System.out.println(stack.top());
//        stack.add(5);
////        System.out.println(stack.size());
////        System.out.println(stack.isEmpty());
////        System.out.println(stack.top());
//        stack.add(3);
////        System.out.println(stack.size());
////        System.out.println(stack.isEmpty());
////        System.out.println(stack.top());
//        System.out.println(stack.getMin());
//        System.out.println(stack.getMin());
//        stack.add(-3);
//        System.out.println(stack.getMin());
//        stack.add(4);
//        System.out.println(stack.getMin());
//        stack.pop();
//        System.out.println(stack.getMin());
//        stack.pop();
//        System.out.println(stack.getMin());

        String A = "{(})";
        BalancedParenthesis balancedParenthesis = new BalancedParenthesis(A);
        System.out.println(balancedParenthesis.isParenthesisBalanced());


    }
}
