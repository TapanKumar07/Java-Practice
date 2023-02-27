package Inheritance;

public class Dog extends Animal{

    private String earShape;

    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        /* super must be the first statement in constructor defination */
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    private String tailShape;

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

   // @Override
    public void move(String Speed) {
        System.out.println("Dogs are honest");
        super.move(Speed);

    }
}
