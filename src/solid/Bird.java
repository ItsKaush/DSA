package solid;

public class Bird {
    private String name;
    private double weight;
    private String color;
    private BirdType type;

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //Code is not readable if the numbers of birds increases.
    //Also Code is not testable for large number of bird types, there will be a lot of codes to be written
    //Single class has the responsibility of make sound and fly which has been violated
    //Also the parallel development is not possible.
    //Responsibility of voice and eat logic should be given to some other class and each should have the separate method for each action.
    //But still there are code smell (multiple if else statements, that is code is getting repeated, tight coupling, Monster methods)
    // If addition of new bird is required then this class needs to be changed and additional else if statement will be required to add
    //which will suffer from ocp violation.
    public void makeSound(){
        if(this.type.equals(BirdType.PEAGON)){
            System.out.println("Gutar goon");
        } else if (this.type.equals(BirdType.SPARROW)) {
            System.out.println("CHIn Chin");
        } else if (this.type.equals(BirdType.CROW)) {
            System.out.println("Cow Cow");
        }
    }

    public void fly(){
        if(this.type.equals(BirdType.PEAGON)){
            System.out.println("Peagon Flying");
        } else if (this.type.equals(BirdType.SPARROW)) {
            System.out.println("Sparrow Flying");
        } else if (this.type.equals(BirdType.CROW)) {
            System.out.println("Crow Flying");
        }
    }
}
