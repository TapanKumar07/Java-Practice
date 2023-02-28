package Abstraction;

public class Horse extends mammel {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.println(this.type + " is moving at " + speed);
    }

    @Override
    public void shedhair() {
        System.out.println(this.type + "  sheds Hair");
    }
}
