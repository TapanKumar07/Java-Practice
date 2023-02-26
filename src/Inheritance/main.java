package Inheritance;

public class main {
    public static void main(String[] args) {
       Animal animal = new Animal("Fish", "Big", 400);
       doAnimalStuff(animal, "Fast");

       Dog d  = new Dog("Bulldog", "medium", 200);
       doAnimalStuff(d, "Slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }
}
