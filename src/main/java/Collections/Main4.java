package main.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main4 {

    public static void main ( String args[]) {

        List<Integer> values = new ArrayList<>();

        values.add(10);
        values.add(2);
        values.add(3);
        values.add(4);

        System.out.println("The max value in the list "+ Collections.max(values));
        System.out.println("The min value in the list "+ Collections.min(values));
        Collections.sort(values);
        System.out.println("The sorted values of the collection");

        values.forEach((Integer val)->System.out.println(val));


    }

}
