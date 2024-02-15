package main.java.classesInDepth.Intefaces;

public class Crocodile implements LandAnimal, WaterAnimal{


    @Override
    public void canSurviveOnLand() {
        System.out.println("yes survive on land");
    }

    @Override
    public boolean canBreath() {
        System.out.println("yes");
        return true;

    }

    @Override
    public void canSurviveInWater() {
        System.out.println("yes survive in water");
    }
}
