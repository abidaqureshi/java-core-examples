package main.java.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main3 {

    public static void main ( String args[]) {

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(4);

        //Size
        System.out.println("Size of the collection "+values.size());

        //isEmpty
        System.out.println("Size of the collection isEmpty "+values.isEmpty());

        //Contains
        System.out.println("Does this collection contains 5 "+values.contains(5));

        //add
        values.add(5);
        System.out.println("Does this collection contains 5"+values.contains(5));

        //Remove value using index
        values.remove(3);
        System.out.println("Item removed from the collection by index "+values.contains(5));

        //Remove using Object, remove the first occurrence of the value
        values.remove(Integer.valueOf(1));

        values.forEach((Integer val)->System.out.println(val));

        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(10);

        //addAll
        values.addAll(stackValues);
        System.out.println("addAll test using containsAll "+values.containsAll(stackValues));

        //ContainsAll
        values.remove(Integer.valueOf(7));

        //Remove all
        values.removeAll(stackValues);
        System.out.println("Does values contains 6 "+values.contains(6));

        //Clears all
        values.clear();
        System.out.println("Does the values has items "+values.isEmpty());


    }


}
