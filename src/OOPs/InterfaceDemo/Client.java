package OOPs.InterfaceDemo;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new HyundaiEngineImpl();
        car.setEngine(engine);
        car.start();
        car.stop();

        Engine engine1 = new MarutiEngineImpl();
        car.setEngine(engine1);
        car.start();
        car.start();
    }
}
