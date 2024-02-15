package main.java.classesInDepth.SingletonAndImmutable;

import java.util.ArrayList;
import java.util.List;

public final class MyImmutable {

    private final String name;
    private final List<Object> petNamesList;

    public MyImmutable ( String name, List<Object> namesList ) {
        this.name = name;
        this.petNamesList = namesList;
    }

    public String getName () {
        return this.name;
    }

    public List<Object> getPetNamesList () {
        //this is required, because making list final
        // means you can not now point it to new list, but still can add or remove items in it
        // so thats why we send the copy of it.
        return new ArrayList<>(this.petNamesList);
    }

}
