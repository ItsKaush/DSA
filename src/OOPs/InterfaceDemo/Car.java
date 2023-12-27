package OOPs.InterfaceDemo;


public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }
}
