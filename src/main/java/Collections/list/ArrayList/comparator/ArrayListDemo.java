package main.java.Collections.list.ArrayList.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main ( String args[]) {

        List<Vehicle> vList1 = new ArrayList<>();

        vList1.add(new Vehicle("alto", "suzuki", 2000));
        vList1.add(new Vehicle("corolla", "Toyota", 2010));
        vList1.add(new Vehicle("crown", "BMW", 2008));
        vList1.add(new Vehicle("crown", "Audi", 2009));

        Collections.sort(vList1, new BrandComparator());

        for(Vehicle v : vList1) {
            System.out.println("the vehicle order by brand " +v.brandName+" "+v.makeYear+" "+v.name);
        }

        Collections.sort(vList1, new MakeYearComparator());

        for(Vehicle v : vList1) {
            System.out.println("the vehicle order by makeYear " +v.brandName+" "+v.makeYear+" "+v.name);
        }

    }
}
