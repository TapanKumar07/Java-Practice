package Abstraction.challeng1;

public abstract class productForSale {
    protected String type;
    protected double price;
    protected String description;

    public productForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int Quantity) {
        return Quantity * price;
    }

    public void printPricedItem(int qty) {
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",
                qty, price, type, description);
    }
    public abstract void showDetails();
}
