package main.java.Collections.deque;

import java.util.ArrayDeque;

public class DequeExample {

    public static void main ( String args[]) {

        ArrayDeque<Integer> arrayDeqAsQList = new ArrayDeque<>();

        arrayDeqAsQList.addLast(2);
        arrayDeqAsQList.addLast(1);
        arrayDeqAsQList.addLast(10);

        for ( Integer number : arrayDeqAsQList) {
            System.out.println ( "The number is "+number);
        }

        Integer element = arrayDeqAsQList.removeFirst();
        System.out.println("The element number is "+element);

        for ( Integer number : arrayDeqAsQList) {
            System.out.println ( "The number is "+number);
        }

        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();

        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(10);
        arrayDequeAsStack.addFirst(12);

        for ( Integer stackNumber : arrayDequeAsStack) {
            System.out.println("This is the number "+stackNumber);
        }

        Integer stackNum = arrayDequeAsStack.removeFirst();

        System.out.println("The popout number of the stack "+stackNum);

    }
}
