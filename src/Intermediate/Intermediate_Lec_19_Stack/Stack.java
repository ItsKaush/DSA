package Intermediate.Intermediate_Lec_19_Stack;

public interface Stack {
    //Data structure which allows first in and last out, insertion happens only from one side.
    //Methods top() - element at the top which is inserted last
    //method  pop() - remove element which is inserted in last
    //size() : size of elements in stack
    //isEmpty() : checks if stack is empty
    //add() : adds an element to stck

    public void add(int element);

    public int top();

    public void pop();

    public int size();

    public boolean isEmpty();

    public int getMin();
}
