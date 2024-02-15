package main.java.Annotations;

@SuppressWarnings("all")
//@SuppressWarnings("deprecation")
//@SuppressWarnings("unused")
public class Main {

    public static void main ( String args[]) {

        Mobile mobile = new Mobile();

        mobile.dummy();

        System.out.println(new Test().getClass().getAnnotation(MyCustomAnnotationWithInherited.class));

        System.out.println("Child class "+new ChildClass().getClass().getAnnotation(MyCustomAnnotationWithInherited.class));

        Category[] categoriesArray = new Eagle().getClass().getAnnotationsByType(Category.class);

        for ( Category category: categoriesArray) {
            System.out.println(category.name());
        }
    }

    public void unusedMethod () {

    }
}
