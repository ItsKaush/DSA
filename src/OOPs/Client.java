package OOPs;

import OOPs.Interfaces.Car;
import OOPs.Interfaces.Node;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Car car1 = new Car(1000,100);
        Car car2 = new Car(2000,200);
        Car car3 = new Car(3000,300);

        Car[] cars = {car1,car2,car3};

        Arrays.sort(cars);

        System.out.println(Arrays.toString(cars));

        Node head = new Node(10,new Node(20,new Node(30,new Node(40,new Node(50)))));

//        for(Node node : head){
//            System.out.println(node.data);
//        }
    }
}
