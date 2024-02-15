package main.java.Collections.list.ArrayList.comparator;

import java.util.Comparator;

public class BrandComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.brandName.compareTo(o2.brandName);
    }
}
