package main.java.Collections.list.ArrayList.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListLambdaDemo {

    public static void main ( String args[]) {

        List<Vehicle> vList1 = new ArrayList<>();
        vList1.add(new Vehicle("","toyota",2001));
        vList1.add(new Vehicle("", "BMW",2011));
        vList1.add(new Vehicle("", "Suzuki", 2009));
        vList1.add(new Vehicle("", "KIA", 2005));

        Collections.sort(vList1, (o1, o2)->o1.makeYear.compareTo(o2.makeYear));

        for ( Vehicle vehicle: vList1) {
            System.out.println(vehicle.makeYear);
        }
    }

}
