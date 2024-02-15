package main.java.classesInDepth.WildCardPackage;

import java.util.List;

public class Print1 {

    /*
        accepts List of type Vehicle or above
        public void setPrintValue ( List<? super Vehicle> vehicleList){

        }

        accepts the List of type Bus or Car or Vehicle but not above Vehicle
        public void setPrintValue ( List<? extends Vehicle> vehicleList){

        }

        wild card method
        public void computeList(List<?> source ) {
            Object obj = source.get(0);
        }

        Generic type method
        public <T> void computeList1(List<T> sourceList, List<T> destinationList) {

        }

        Generic Class Erasure ( If we create object of a Generic class without provide the type it will
        automatically replace <T> with Object class <Object)
        public class Print<T> {
            T value;
            public void setValue ( T val ) {
                this.value = val;
            }
        }

        Generic Class Bound Type Erasure ( if don't replace T with the type then the upper bound will come the default type for
        all the values)
        public class Print< T extend Number> {

            T value;
            public void setValue ( T val ) {
                this.value = val;
            }

        }


     */
    public void setPrintValue ( List<? extends Vehicle> vehicleList){

    }
}
