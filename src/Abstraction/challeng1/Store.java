package Abstraction.challeng1;

import java.util.ArrayList;

public class Store {

    private static ArrayList<productForSale> storeProducts = new ArrayList<productForSale>();
    public static void main(String[] args) {
        storeProducts.add(new artObject("Painting", 232, "paininting is good"));
        storeProducts.add(new artObject("Sculpture", 2121, "legendary peice"));
        listProducts();
    }

    public static void listProducts() {
        for(var items : storeProducts) {
            System.out.println("-".repeat(30));
            items.showDetails();
        }
    }
}
