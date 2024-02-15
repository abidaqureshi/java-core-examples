package main.java.Annotations;

import java.lang.annotation.*;

@Repeatable(Categories.class)
public @interface Category {

    String name();
}
