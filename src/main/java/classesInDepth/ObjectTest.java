package main.java.classesInDepth;

import main.java.classesInDepth.AnonymousClasses.Truck;
import main.java.classesInDepth.Enums.*;
import main.java.classesInDepth.GenericClasses.Print;
import main.java.classesInDepth.GenericSubClass.ColorPrint2;
import main.java.classesInDepth.InnerClasses.OuterClass4;
import main.java.classesInDepth.InnerClasses.OuterClass5;
import main.java.classesInDepth.Intefaces.*;
import main.java.classesInDepth.MoreGenericTypes.GenericMethodClass;
import main.java.classesInDepth.MoreGenericTypes.Pair;
import main.java.classesInDepth.NonGenericSubClass.ColorPrint;
import main.java.classesInDepth.RawGenericClasses.RawGenericClass;
import main.java.classesInDepth.SingletonAndImmutable.EagerDBConnection;
import main.java.classesInDepth.SingletonAndImmutable.MyImmutable;
import main.java.classesInDepth.StaticNestedClasses.OuterClass;
import main.java.classesInDepth.StaticNestedClasses.OuterClass2;
import main.java.classesInDepth.InnerClasses.OuterClass3;
import main.java.classesInDepth.UpperBoundGeneric.UpperBoundGenericClass;
import main.java.classesInDepth.WildCardPackage.Bus1;
import main.java.classesInDepth.WildCardPackage.Car1;
import main.java.classesInDepth.WildCardPackage.Print1;
import main.java.classesInDepth.WildCardPackage.Vehicle;

import java.util.ArrayList;
import java.util.List;

//Every parent class has by default Object parent class in Java which is hidden
public class ObjectTest {

    public static void main (String args[]) {

        Object obj1 = new Person(344);
        Object obj2 = new Audi(12);

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());

        OuterClass.NestedClass nestObj = new OuterClass.NestedClass();
        nestObj.print();

        OuterClass2 obj3 = new OuterClass2();
        obj3.display();

        OuterClass3 outerClass3cObj = new OuterClass3();

        OuterClass3.InnerClass innerClassObj = outerClass3cObj.new InnerClass();
        innerClassObj.print();

        OuterClass4 outerClassObj4 = new OuterClass4();
        outerClassObj4.display();

        OuterClass5 outClassObj = new OuterClass5();
        OuterClass5.InnerClass2 inClassObj = outClassObj.new InnerClass2();
        inClassObj.display();

        //Implementation of anonymous class
        Truck trk1 = new Truck() {
            @Override
            public void pressBreak() {
                System.out.println("the truck breaks are applied");
            }
        };

        trk1.pressBreak();

        //Generic classes
        Print<Integer> printObj1 = new Print<>();
        printObj1.setPrintValue(1);
        Integer printValue = printObj1.getPrintVale();

        //NonGeneric subClass
        ColorPrint colorPrintObj = new ColorPrint();
        colorPrintObj.setPrintValue("Hello");

        //Generic subClass
        ColorPrint2<String> colorP2Obj = new ColorPrint2<>();
        colorP2Obj.setPrintValue("5");
        System.out.println(colorP2Obj.getPrintVale());

        //Class with more Generic types
        Pair<String, Integer> pairObj = new Pair<>();
        pairObj.setValue("dogs", 5);

        //A class with generic method
        GenericMethodClass genericMethodObj = new GenericMethodClass();
        Pair<String, Integer> pair1 = new Pair<>();
        Pair<String, Integer> pair2 = new Pair<>();
        pair1.setValue("Cars", 5);
        pair2.setValue("Cars", 6);
        genericMethodObj.printValue(pair1, pair2);

        //A Raw Generic type class
        RawGenericClass rawGenObj = new RawGenericClass();
        rawGenObj.setValue(1);
        System.out.println(rawGenObj.getPrintValue());
        rawGenObj.setValue("Hello");
        System.out.println(rawGenObj.getPrintValue());

        //Upperbound generic class type
        UpperBoundGenericClass<Integer> upperBoundC1Obj = new UpperBoundGenericClass<Integer>();

        //
        List<Vehicle> vehicleList = new ArrayList<>();
        List<Bus1> busList = new ArrayList<>();
        vehicleList.add(new Bus1());
        vehicleList.add(new Car1());

        Print1 printObj = new Print1();
        printObj.setPrintValue(vehicleList);

        //Using Normal ENUM class in Main classes

        /**
         * Common functions which is used with Enum
         * - values()
         * - Ordinal()
         * - ValueOf()
         * - name()
         */

        //1. usage of Values() and ordinal()
        for ( EnumSample sample: EnumSample.values()) {
            System.out.println(sample.ordinal());
        }

        //2. usage of ValueOf() and name()
        EnumSample enumVariable = EnumSample.valueOf("FRIDAY");
        System.out.println("The value of Friday "+enumVariable.ordinal()+ " and name is "+enumVariable.name());

        //3. Enum class with custom values
        EnumSample2 enumSample2 = EnumSample2.getValueByKey(107);
        System.out.println("The value of Enum custom 107 is "+enumSample2.getComment());


        //4. Enum class with method overriding constants
        EnumSample3 enumSample3 = EnumSample3.FRIDAY;
        enumSample3.dummyMethod();
        EnumSample3 monday = EnumSample3.MONDAY;
        monday.dummyMethod();

        //5. Enum class with abstract method
        EnumSample4 enumSample4 = EnumSample4.WEDNESDAY;
        enumSample4.dummyMethod();

        //6. Enum class implementing interface
        EnumSample5 enumSample5 = EnumSample5.MONDAY;
        System.out.println(enumSample5.toLowerCase());

        EagerDBConnection conObj = EagerDBConnection.getInstance();

        List<Object> petNames = new ArrayList<>();
        petNames.add("sj");
        petNames.add("pg");

        MyImmutable myImmutableObj = new MyImmutable("dogs",petNames);

        myImmutableObj.getPetNamesList().add("kyle sympson");
        System.out.println(myImmutableObj.getPetNamesList());

        Bird flyBObj = new Eagle();
        Bird flyHen = new Hen();

        flyBObj.fly();
        flyHen.fly();

        WaterAnimal croc = new Crocodile();
        croc.canBreath();

        Owl wOwlObj = new WhiteOwl();
        wOwlObj.fly();

        Animal.NonAnimal pObj = new Pigeon();
        pObj.canFly();

    }


}
