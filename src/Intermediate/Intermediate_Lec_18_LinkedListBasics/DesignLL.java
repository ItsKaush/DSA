package Intermediate.Intermediate_Lec_18_LinkedListBasics;

public class DesignLL {
    private int[][] A;
    static int size = 0;

    public void setA(int[][] a) {
        A = a;
    }
    /* There are four types of operations:

            0 x -1: Add a node of value x before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
            1 x -1: Append a node of value x to the last element of the linked list.
            2 x index: Add a node of value x before the indexth node in the linked list. If index equals to the length of linked list, the node will be appended to the end of
            linked list. If index is greater than the length, the node will not be inserted.
            3 index -1: Delete the indexth node in the linked list, if the index is valid.
    A[i][0] represents the type of operation.
    A[i][1] represents the value to be inserted.
    A[i][2] represents the index (see explanation above) where the operation needs to be applied.
    */
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            next = null;
        }
    }
    public static ListNode head = null;
    public ListNode solve(){
        for(int i=0; i<A.length; i++){
            if(A[i][0] == 0 && A[i][2] == -1){
                //Add as start
                insert_node_At_Head(0, A[i][1]);
            } else if (A[i][0] == 1 && A[i][2] == -1) {
                //Add at end
                insert_node_At_End(A[i][1]);
            } else if (A[i][0] == 2) {
                //Insert at any index
                insert_node_at_index(A[i][2], A[i][1]);
            } else if (A[i][0] == 3) {
                delete_node_at_index(A[i][1]);
            }
        }
        return head;
    }

    private void insert_node_At_Head(int position, int value) {
        //insert at start
        ListNode node = new ListNode(value);
            node.next = head;
            head = node;
            size++;
    }

    private void insert_node_At_End(int val) {
        //move a temp node to position
        ListNode node = new ListNode(val);
        ListNode temp = head;
        if(size == 0){
            head = node;
            size++;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    private void insert_node_at_index(int position, int val){
        ListNode node = new ListNode(val);
        if(position < 0 || position > size){
            return;
        }
        if(size == 0 || position == 0){
            insert_node_At_Head(0,val);
        }
        if (position == size-1) {
            //append at end
            insert_node_At_End(val);
        }

        //at any intermediate index, it should be inserted before index
        ListNode temp = head;
        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    public void delete_node_at_index(int position){
        //delete only if it is valid position (0th based indexing)
        if(head== null || position < 0 || position >= size){
            return;
        }

        if (position == 0) {
            head = head.next;
            size--;
            return;
        }
        ListNode temp = head;
        for(int i=0; i<position-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public void print_ll () {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}

