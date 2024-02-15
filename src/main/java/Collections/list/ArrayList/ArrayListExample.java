package main.java.Collections.list.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListExample {

    public static void doSomeWork(List list) {
        list.add("India");
    }

    public static void main ( String args[]) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();


        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(14);
        arrayList.add(16);

        System.out.println(arrayList);
        arrayList2.add(17);
        arrayList2.add(19);
        arrayList.addAll(2,arrayList2);

        System.out.println(arrayList);

        //fetching elements
        System.out.println("Fetching the value from array by index "+arrayList.get(2));
        System.out.println("The size of the array is "+arrayList.size());

        //Removing elements from ArrayList
        arrayList.remove(3);
        System.out.println("The array list elements "+arrayList);

        arrayList.remove(new Integer(17));

        System.out.println("The array list elements "+arrayList);

        arrayList.clear();
        System.out.println(arrayList);

        //Using replace all with lambda function
        List<String> strList = new ArrayList<>();

        strList.add("apple");
        strList.add("banana");
        System.out.println(strList);
        strList.replaceAll((element)->element.toUpperCase(Locale.ROOT));

        System.out.println(strList);

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(10);
        listInteger.add(20);
        listInteger.add(30);
        listInteger.add(40);
        listInteger.add(50);

        listInteger.set(3,30);

        System.out.println(listInteger);

        if (listInteger.contains(40)) {
            System.out.println("the digit exist");
        }

        System.out.println(" the first occurrence of the number is "+listInteger.indexOf(30));
        System.out.println(" the first occurrence of the number is "+listInteger.lastIndexOf(30));

        //Iterating through array list
        for ( int i =0; i < listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }

        //Another version of iteration
        for ( Integer item: listInteger) {
            System.out.println(item);
        }

        //Iterator method return iterator object which has implemented interface
        Iterator<Integer> iterator = listInteger.iterator();

        while(iterator.hasNext()) {
            System.out.println("the iterator method "+iterator.next());
        }

        //forEachRemaining
        Iterator<Integer> iterator1 = listInteger.iterator();
        iterator1.forEachRemaining((element)->System.out.println(element));

        //You cannot remove the element directly, ConcurrentModification exception will be thrown
        Iterator<Integer> iterator2 = listInteger.iterator();
//
//        while(iterator2.hasNext()) {
//
//            int val = iterator2.next();
//            System.out.println("inside while "+val);
//            if ( val == 30 ) {
//                listInteger.remove(new Integer(30));
//            }
//        }

        //Correct way of deleting item from the list while iterating
        while(iterator2.hasNext()) {
            int val = iterator2.next();
            if ( val == 30 ) {
                iterator2.remove();
            }
        }
        System.out.println(listInteger);

        //Adding element to list after creating iterator ConcurrentModification exception will be thrown
        Iterator<Integer> iterator3 = listInteger.iterator();
       // listInteger.add(60);
        while(iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        //ListIterator

        //Getting list iterator
        ListIterator<Integer> listIterator4 = listInteger.listIterator();

        //Traversing elements forward
        System.out.println("Forward direction of iteration");
        while (listIterator4.hasNext()) {
            System.out.println("Next element is "+listIterator4.next());
            System.out.println("Next element index is "+listIterator4.nextIndex());
        }

        //Traversing elements backward
        System.out.println("Backward direction of iteration");
        while (listIterator4.hasPrevious()) {
            System.out.println("Previous element is "+listIterator4.previous());
            System.out.println("Previous element index is "+listIterator4.previousIndex());
        }

        List list = new ArrayList();
        list.add(10);
        list.add(20);
        //doSomeWork(list);

        //Integer i = (Integer) list.get(2);


        //Sorting ArrayList using Collection sort function
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(10);
        list1.add(5);
        list1.add(19);
        list1.add(4);

        System.out.println("Unsorted list of integers");
        System.out.println(list1);
        System.out.println("Sorted list of integers");
        Collections.sort(list1);
        System.out.println(list1);

        //Sorting using streams
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(10);
        list2.add(15);
        list2.add(1);
        list2.add(4);

        List<Integer> sortedList = list2.stream().sorted().collect(Collectors.toList());

        System.out.println("the sorted list using stream "+sortedList);


        //Sorting in descending order using Sort method

        List<Integer> list3 = new ArrayList<>();
        list3.add(34);
        list3.add(12);
        list3.add(9);
        list3.add(76);
        list3.add(29);
        list3.add(75);

        Collections.sort(list3, Collections.reverseOrder());
        System.out.println("Collections.sort(list3, Collections.reverseOrder()); ArrayList in desc order: " + list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(34);
        list4.add(12);
        list4.add(9);
        list4.add(76);
        list4.add(29);
        list4.add(75);

        List<Integer> descendList = list4.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("using list4.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()); ArrayList in asc order: " + descendList);






    }
}
