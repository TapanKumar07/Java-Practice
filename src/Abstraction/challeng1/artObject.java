package Abstraction.challeng1;

public class artObject extends productForSale{
    public artObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beautiful reproduction");
        System.out.printf("The price of piece is $%6.2f %n", price);
        System.out.println(description);
    }
}
