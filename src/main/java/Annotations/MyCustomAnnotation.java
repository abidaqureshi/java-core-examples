package main.java.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface MyCustomAnnotation {
    String name();
}
