package Inheritance;

public class main {
    public static void main(String[] args) {
       Animal animal = new Animal("Fish", "Big", 400);
       doAnimalStuff(animal, "Fast");

       Dog d  = new Dog("Bulldog", "medium", 200, "round", "pony");
       doAnimalStuff(d, "Slow");

       //Fish p = new Fish("Piranha", "small", 40, 1, 2);
       //doAnimalStuff(p, "Fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }
}
