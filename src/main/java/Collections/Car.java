package main.java.Collections;

import java.util.Comparator;

public class Car implements Comparator<Car> {

    String carName;
    String carType;

    Car(String name, String type ) {
        this.carName = name;
        this.carType = type;
    }

    @Override
    public int compare(Car o1, Car o2) {
        return o1.carName.compareTo(o2.carName);
    }
}
