package Abstraction;

public class Dog extends Animal{

    //forcing subclasses to call super class constructor
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(type + " is moving at " + speed);
    }

    @Override
    public void makeNoise() {
         if(type == "Wolf") {
             System.out.println("Howling! ");
         } else {
             System.out.println("Woof! ");
         }
    }
}
