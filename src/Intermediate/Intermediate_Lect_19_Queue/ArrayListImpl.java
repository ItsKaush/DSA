package Intermediate.Intermediate_Lect_19_Queue;

import java.util.ArrayList;

public class ArrayListImpl implements CustomQueue{
    ArrayList<Integer> list = new ArrayList<>();

    @Override
    public void add(int element) {
        //Add element at rear
        list.add(element);
    }

    @Override
    public void poll() {
        //remove element from front
        if(list.size() == 0){
            throw new ArrayIndexOutOfBoundsException("No element is queue to remove: Queue is empty");
        }
        list.remove(list.size()-1);
    }

    @Override
    public int peekRear() {
        //Remove element at rear
        if(list.size() == 0){
            throw new ArrayIndexOutOfBoundsException("No element is queue to peek: Queue is empty");
        }
        return list.get(0);
    }

    @Override
    public int peekFront(){
        if(list.size() == 0){
            throw new ArrayIndexOutOfBoundsException("No element is queue to remove: Queue is empty");
        }
        return list.get(list.size()-1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.size()==0 ? true : false;
    }
}
