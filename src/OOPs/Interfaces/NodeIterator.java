package OOPs.Interfaces;

import java.util.Iterator;

public class NodeIterator implements Iterator<Node> {

    private Node head;

    public NodeIterator(Node head) {
        this.head = head;
    }
    @Override
    public boolean hasNext() {
        return this.head != null;
    }

    @Override
    public Node next() {
        Node temp = head;
        head = head.next;
        return temp;
    }
}
