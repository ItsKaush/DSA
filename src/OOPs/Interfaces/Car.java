package OOPs.Interfaces;

import java.util.Arrays;

public class Car implements Comparable<Car>{

    int price;
    int speed;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                '}';
    }

    /* Want to sort car on the basis of price */



    @Override
    public int compareTo(Car obj) {
        return     this.price - obj.price;
    }

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car(100, 200);
        cars[1] = new Car(200, 100);
        cars[2] = new Car(300, 50);

        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

    }
}
