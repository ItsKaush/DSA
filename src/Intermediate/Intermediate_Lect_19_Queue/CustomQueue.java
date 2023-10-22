package Intermediate.Intermediate_Lect_19_Queue;

public interface CustomQueue {
    public void add(int element);
    public void poll();
    public int peekRear();
    public int peekFront();
    public int size();
    public boolean isEmpty();
}
