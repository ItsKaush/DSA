package OOPs.InterfaceDemo;

public class MarutiEngineImpl implements Engine{
    @Override
    public void start() {
        System.out.println("Maruti engine is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Maruti engine is stopping.");
    }
}
