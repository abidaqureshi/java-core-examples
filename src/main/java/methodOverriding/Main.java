package main.java.methodOverriding;

public class Main {

    public static void main ( String args[]) {

        Vehicle v = new Car();
        v.doors();
        v.engineCapacity();
        v.Type();
        v.Brand();

        Car c = new Jeep();
        c.speed();
    }
}
