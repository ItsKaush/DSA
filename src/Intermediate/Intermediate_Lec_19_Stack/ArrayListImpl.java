package Intermediate.Intermediate_Lec_19_Stack;

import java.util.ArrayList;

public class ArrayListImpl implements Stack{
    ArrayList<Integer> list = new ArrayList<>();
    int size = 0;
    @Override
    public void add(int element) {
        list.add(element);
        size++;
    }

    @Override
    public int top() {
        //check size and return the last element
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException("No element in the stack to peek");
        }
        return list.get(size-1);
    }

    @Override
    public void pop() {
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException("No element in the stack to delete");
        }
        list.remove(size-1);
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0 ? true : false;
    }

    @Override
    public int getMin() {
        return 0;
    }
}
