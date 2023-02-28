package Abstraction;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /*
        Abstraction -> Using abstract methods,
                       Using interfaces

                    Abstract method - unimplemented and empty body
                                    - describe behaviour (for example -> move or eat for a animal)
                                    - can only be declared on abstract class or interface

                    Concrete Method - implements abstract method if it overrides one

                    Sub classes inheriting from abstract class MUST provide concrete method of any abstract
                    declared to its parent otherwise it wont compile

                    Abstract class -> incomplete
                                   - can't create instance of it
                                   - Has a constructor
                                   - defines behaviour of subclasses so always participates in inheritance
                                   - Abstract classes can extend concrete/abstract classes

         */
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Bulldog", "Big", 120));
        animals.add(new Dog("pug", "small", 50));
        animals.add(new Fish("goldfish", "small", 10));
        animals.add(new Fish("Piranahh", "Meduim", 20));

        animals.add(new Horse("Ghoda", "Large", 1000));

        for(Animal animal: animals) {
            doAnimalStuff(animal);
            if(animal instanceof Horse hii)
                hii.shedhair();
        }

    }
    public static void doAnimalStuff(Animal animal) {
         animal.move("100");
         animal.makeNoise();
    }
}
