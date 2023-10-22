package Intermediate.Intermediate_Lect_19_Queue;

public class Client {
    public static void main(String[] args) {
//        CustomQueue queue = new ArrayListImpl();
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        queue.add(3);
//        queue.add(5);
//        System.out.println(queue.size());
//        System.out.println(queue.isEmpty());
//        queue.poll();
//        System.out.println(queue.peekRear());
//        System.out.println(queue.peekFront());

        CustomQueue queue1 = new LinkedListImpl();
        System.out.println(queue1.size());
        System.out.println(queue1.isEmpty());
        queue1.add(4);
        queue1.add(1);
        queue1.add(-7);
        System.out.println(queue1.size());
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.peekRear());
        System.out.println(queue1.peekFront());
    }
}
