package OOPs.InterfaceDemo;

public class HyundaiEngineImpl implements Engine{
    @Override
    public void start() {
        System.out.println("Hyundai engine is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Hyundai engine is stopping.");
    }
}
