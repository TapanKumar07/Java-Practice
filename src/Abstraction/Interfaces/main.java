package Abstraction.Interfaces;

public class main {
    public static void main(String[] args) {
        Bird b = new Bird();
        Animal a = b;
        FlightEnabled f =b;
        Trackable t= b;
/*
       Interfaces lets us take objects that may have nothing in common and write reusable code so we can
       process them in a like manner

       Interfaces allows us to type our objects diffrently by behaviour only
 */
//        a.fly();
//        a.land();
//        a.takeOff();

        if(f instanceof Trackable th)
            th.track();
        // in above if f object is a class that implements trackable then th
        // variable is set up with type trackable
    }
}
