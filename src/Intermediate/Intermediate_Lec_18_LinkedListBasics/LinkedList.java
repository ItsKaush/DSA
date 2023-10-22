package Intermediate.Intermediate_Lec_18_LinkedListBasics;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class LinkedList {
    static int size = 0;
    static Node head = null;
    public void insert_node(int position, int value){
//        if(position == 1){
//            Node node = new Node(value);
//            node.next = null;
//            head = node;
//            size++;
//        } else if (position <= size+1){
//            // 1     2     3  Pos = 2
//            //       i
//            // 2 --> 4 --> 6
//            //       t
//            Node temp = head;
//            //move upto previous to position
//            for(int i=1; i<position-1; i++){
//                temp = temp.next;
//            }
//            Node node;
//            node = new Node(value);
//            node.next = temp.next;
//            temp.next = node;
//            size++;
//        }
        if(position==1){
            Node n = new Node(value);
            n.next = head;
            head = n;
            size++;
        }
        else if(position<=size+1){
            Node n = new Node(value);
            Node temp = head;
            for(int i=1; i<position-1; i++){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }

    public void delete_node(int position){
        //Move temp node to previous to that node and link it to ext to next
        //When position is first element then move head to next position
        //when position is at last node then move temp to previous to that node make it next as null
        if(position == 1){
            head = head.next;
            size--;
        } else if (position == size) {
            Node temp = head;
            for(int i=0; i<position-1; i++){
                temp = temp.next;
            }
            temp.next = null;
            size--;
        } else if (position>1 && position<size) {
            Node temp = head;
            for(int i=0; i<position-2; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void print_ll(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
