package Abstraction;

public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(type + " is moving at " + speed);
    }

    @Override
    public void makeNoise() {
        if(type == "goldfish") {
            System.out.println("speesh! ");
        } else {
            System.out.println("splash! ");
        }
    }
}
