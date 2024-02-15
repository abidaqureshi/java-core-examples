package main.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ObjectCollectionSorting {

    public static void main ( String args[]) {

        // Non Primitive wrapper
        Integer numList[] = {10,2,7,5,3,2,1};
        Arrays.sort(numList, ( Integer a, Integer b)-> a-b);
        for ( Integer a: numList) {
            System.out.println("the value of num list is "+a);
        }

        // Non Primitive Object collections
        Car[] carList = new Car[3];

        carList[0] = new Car("Sedan", "PETROL");
        carList[1] = new Car("Suv", "DIESEL");
        carList[2] = new Car("Hatchback", "CNG");

        Arrays.sort(carList, (Car obj1, Car obj2)->obj2.carType.compareTo(obj1.carType));


        for ( Car car : carList) {
            System.out.println("the car name "+car.carName+"  car type "+car.carType);
        }

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Sedan","Petrol"));
        cars.add(new Car("Suv", "Diesel"));
        cars.add(new Car("Hatchback", "CNG"));

        Collections.sort(cars, (Car obj1, Car obj2)->obj2.carName.compareTo(obj1.carName));

        Collections.sort(cars, new CarNameComparator());

        cars.forEach((Car  obj)->System.out.println("the car list "+obj.carName+" "+obj.carType));

        List<Bird> birds = new ArrayList<>();
        birds.add(new Bird("sparrow","vegetarian"));
        birds.add(new Bird("crow","meat"));
        birds.add(new Bird("Hawk","meat"));

        Collections.sort(birds);


    }



}
