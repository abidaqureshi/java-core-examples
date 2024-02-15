package main.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {

    public static void main (String args[]) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Using iterator to print all values");

        Iterator<Integer> valuesIterator = list.iterator();

        while(valuesIterator.hasNext()) {
            int val = valuesIterator.next();
            System.out.println("The value of the iterator "+val);

            if(val == 3 ) {
                valuesIterator.remove();
            }
        }

        System.out.println("The value of the list using for loop");

        for ( int val: list) {
            System.out.println("the value list item "+val);
        }

        System.out.println("The value of the list using forEach loop using lambda expression");

        list.forEach((Integer val)->System.out.println(val));



    }
}
