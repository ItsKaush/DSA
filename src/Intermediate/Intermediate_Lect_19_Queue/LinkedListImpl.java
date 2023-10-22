package Intermediate.Intermediate_Lect_19_Queue;

class Node{
     int data;
     Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListImpl implements CustomQueue{
    Node head = null;
    Node tail = null;
    int size = 0;
    @Override
    public void add(int element) {
        //If first element then point both tail and head to this if not insert at tail (head will always point at front and tail will point to rear)
        //Insertion will happen from rear ie. at tail
        Node node = new Node(element);

        if(isEmpty()){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    // ht
    // 2
    // h     t
    // 2 --> 3
    // 2 --> 3 --> 4
    @Override
    public void poll() {
        //If queue is empty then throw exception else remove element at tail and move tail to previous node
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("No element to remove from Queue: Queue is empty");
        }
        head = head.next;
        size--;
    }

    @Override
    public int peekRear() {
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("No element to peek in Queue: Queue is empty");
        }
        return tail.data;
    }

    @Override
    public int peekFront() {
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("No element to remove from Queue: Queue is empty");
        }
        return head.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0 ? true : false;
    }
}
