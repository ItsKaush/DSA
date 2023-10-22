package Intermediate.Intermediate_Lec_19_Stack;

//At every node maintain two data one vla and other min.
class Node {
    int data;
    int min;
    Node next;

    public Node(int data, int min) {
        this.data = data;
        this.min = min;
        this.next = null;
    }
}

    public class LinkedListImpl implements Stack {
        Node head = null;
        int size = 0;

        @Override
        public void add(int element) {
            if(isEmpty()){
                Node node = new Node(element,element);
                node.next = head;
                head = node;
                size++;
                return;
            }
            int val = Math.min(element,head.min);
            Node node = new Node(element,val);
            node.next = head;
            head = node;

            size++;
        }

        @Override
        public int top() {
            if (isEmpty()){
                throw new ArrayIndexOutOfBoundsException("No element to get from stack.");
            }
            return head.data;
        }

        @Override
        public void pop() {
            if(isEmpty()){
                throw new ArrayIndexOutOfBoundsException("No element to pop from stack.");
            }
            //when top element is removed and if it is min then need to find the next element which can be minimum

            head = head.next;

            size--;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            return size == 0;
        }

        @Override
        public int getMin() {
            if(isEmpty()){
                return -1;
            }
            return head.min;
        }
    }
