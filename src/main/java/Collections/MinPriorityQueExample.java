package main.java.Collections;

import java.util.PriorityQueue;

public class MinPriorityQueExample {

    public static void main ( String args[]) {

        PriorityQueue<Integer> pMinList = new PriorityQueue<>();

        pMinList.add(5);
        pMinList.add(3);
        pMinList.add(8);
        pMinList.add(2);
        pMinList.add(1);

        pMinList.forEach((Integer val)-> System.out.println("the integer value "+val));

        //remove top element from the PQ and print

        while (!pMinList.isEmpty()) {
            int val = pMinList.poll();
            System.out.println("remove from the top "+val);
        }



    }
}
