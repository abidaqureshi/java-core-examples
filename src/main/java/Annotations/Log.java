package main.java.Annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class Log {

    @SafeVarargs
    public static void printLogValues(List<Integer>...ListOfNumbers) {

        Object[] numList = ListOfNumbers;

        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("hello");
        numList[0] = listOfStrings;

    }
}
