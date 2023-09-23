package OOPs.Interfaces;

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
        return obj.price -this.price ;
    }
}
