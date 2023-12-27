package OOPs.Interfaces;

public class Client {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.x);
//        System.out.println(parent.y);
        parent.fun();


        Parent parent1 = new Child();
        parent1.fun();
        System.out.println(parent1.x);
        System.out.println(((Child)parent1).y);
        ((Child)parent1).fun1();

        Child child = new Child();
        System.out.println(child.x);
        System.out.println(child.y);
        System.out.println(child.z);
        child.fun2();
        child.fun();
        child.fun1();
    }
}
