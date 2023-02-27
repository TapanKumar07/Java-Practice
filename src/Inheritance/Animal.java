package Inheritance;

public class Animal {
    private String type;
    private String size;
    private double weight;
    public Animal() {

    }
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void makeNoise() {
        System.out.println(this.type + " animal is making noise");
    }

    public void move(String Speed) {
        System.out.println(this.type + " animal is moving " + Speed);
    }
    @Override
    public String toString() {

        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
