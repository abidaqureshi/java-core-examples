package main.java.methodOverriding;

public class Car implements Vehicle {

    int speed = 90;
    static final int DOORS = 4;


    @Override
    public void doors() {

        System.out.println(DOORS);
    }

    @Override
    public void engineCapacity() {
        System.out.println("2.8L");
    }

    @Override
    public void Type() {
        System.out.println("Sedan");
    }

    @Override
    public void Brand() {
        System.out.println("Toyota ");
    }

    protected void speed () {
        System.out.println("90km/hour");
    }
}
