package Abstraction.Interfaces;

public abstract class Animal {
    public abstract void move();
}

interface FlightEnabled {
    void takeOff();
    void fly();
    void land();
}

interface Trackable {
    void track();
}
