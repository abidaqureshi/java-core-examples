package main.java.reflection;

import java.lang.reflect.*;

public class Main
{
    public static void main ( String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        Class eagleClass = Eagle.class;

        Method[] methods = eagleClass.getMethods(); // It will return all public methods

        for (Method method: methods) {
            System.out.println("Method name: "+method.getName());
            System.out.println("Return Type: "+method.getReturnType());
            System.out.println("Class name: "+method.getDeclaringClass());
            System.out.println("*****");
        }

        //get all declare methods public and private both of Eagle class only
        Method[] dcLMethods = eagleClass.getDeclaredMethods();

        for (Method method: dcLMethods) {
            System.out.println("Method: "+method.getName());
        }

        //System.out.println(eagleClass.getName());
        //System.out.println(Modifier.toString(eagleClass.getModifiers()));

        //Invoking method using reflection
        Class eagleClass1 = Eagle.class;
        Object eagleObject = eagleClass1.newInstance();

        Method flyMethod = eagleClass1.getMethod("fly", int.class, boolean.class, String.class);
        flyMethod.invoke(eagleObject, 1, true, "test");

        //getting the reflection of fields, get both public and private fields
        Field[] fields = eagleClass1.getDeclaredFields();
        for ( Field field: fields) {
            System.out.println("******");
            System.out.println("FieldName "+field.getName());
            System.out.println("Type: "+field.getType());
            System.out.println("Modifier: "+Modifier.toString(field.getModifiers()));
            System.out.println("******");
        }

        //Setting th value of public field

        Class eagleClassObj2 = Eagle.class;
        Eagle eagleObj = new Eagle();

        //Set both public and private fields with this
        Field field1 = eagleClassObj2.getDeclaredField("breed");
        //The incorrect way of setting the value of private field
        Field field2 = eagleClassObj2.getDeclaredField("canSwim");
        field1.set(eagleObj, "White and brown eagle");
        //field2.set(eagleObj, true);

        //Correct way setting the value of private field
        field2.setAccessible(true);
        field2.set(eagleObj, true);

        if (field2.getBoolean(eagleObj)) {
            System.out.println("value is set to true");
        }

        System.out.println(eagleObj.breed);

        //Get the reflection of the constructor ( With the help of reflection you can break the Singleton pattern e.g Rabbit Class )
        Class rabbit1 = Rabbit.class;

        //to access private constructor too.
        Constructor[] rabbitConstructorList = rabbit1.getDeclaredConstructors();

        for ( Constructor rabbitConstructor: rabbitConstructorList) {
            System.out.println("the Modifier "+Modifier.toString(rabbitConstructor.getModifiers()));

            rabbitConstructor.setAccessible(true);
            Rabbit rabitConstrObj = (Rabbit) rabbitConstructor.newInstance();
            rabitConstrObj.fly();

        }






    }
}
