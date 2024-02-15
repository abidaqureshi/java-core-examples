package main.java.Collections;

import java.util.PriorityQueue;

public class MaxPriorityQue {

    public static void main (String args[]){

        PriorityQueue<Integer> maxQList = new PriorityQueue<>((Integer a, Integer b)->b-a);
        maxQList.add(5);
        maxQList.add(2);
        maxQList.add(8);
        maxQList.add(1);

        maxQList.forEach((Integer num)->System.out.println("Max heap is "+num));

        while (!maxQList.isEmpty()) {
            int n = maxQList.poll();
            System.out.println("the number pop from max Priority Que "+n);
        }

    }
}
