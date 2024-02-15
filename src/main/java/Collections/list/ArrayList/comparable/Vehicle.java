package main.java.Collections.list.ArrayList.comparable;

public class Vehicle implements Comparable<Vehicle> {
    String brand;
    Integer makeYear;

    public Vehicle(String brand, Integer year) {
        this.brand = brand;
        this.makeYear = year;
    }

    @Override
    public int compareTo(Vehicle o) {
        //To compare it by make year
        return this.makeYear - o.makeYear;
        //To compare it by brand
        //return this.brand.compareTo(o.brand);
    }
}
