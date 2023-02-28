package Abstraction;

public abstract class mammel extends Animal{
    public mammel(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("Mammel is making noise");
    }

    public abstract void shedhair();
}
