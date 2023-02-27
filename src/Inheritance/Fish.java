package Inheritance;

public class Fish extends Dog {
     private int fin, gills;

    public Fish(String type, String size, double weight, int fin, int gills) {
        super(type, size, weight);
        this.fin = fin;
        this.gills = gills;
    }

    public void moveMuscles() {
        System.out.println("muscle moving");
    }

    public void moveBackFin() {
        System.out.println("backfin moving");
    }

    @Override
    public void move(String Speed) {
        super.move(Speed);
        moveMuscles();
        if(Speed == "Fast") {
            System.out.println("Thamm jaa Bhai");
        } else {
            System.out.println("Tezz chl bro");
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fin=" + fin +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
