package solid;

public class Peagon extends Bird implements Birds{
    String name;
    int weight;
    String color;
    @Override
    public void makeSound() {
        System.out.println("gooter goon");
    }

    @Override
    public void eat() {
        System.out.println("Peagon Eating");
    }

    @Override
    public void fly() {
        System.out.println("Peagon Flying");

    }
}
