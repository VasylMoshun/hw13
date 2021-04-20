package lection13;

public class BmwX5 implements BasicCar{
    final public int light = 100;
    @Override
    public void drive() {
        System.out.println("BmwX5 rides!");

    }

    @Override
    public void xenonOn() {
        System.out.println("BmwX5 xenon on ");

    }

    @Override
    public void xenonOff() {
        System.out.println("BmwX5 xenon off ");

    }
}
