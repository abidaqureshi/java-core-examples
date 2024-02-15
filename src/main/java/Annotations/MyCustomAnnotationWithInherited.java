package main.java.Annotations;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotationWithInherited {
}
