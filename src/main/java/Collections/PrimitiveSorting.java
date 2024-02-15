package main.java.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimitiveSorting {

    public static void main ( String args[]) {

        int[] arr = {10,5,4,3,1};

        Arrays.sort(arr);

        for ( int i = 0; i < arr.length; i++ ) {
            System.out.println("the number in array is "+arr[i]);
        }

    }


}
