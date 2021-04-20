package lection13;

public class BmwX5Usa implements BasicCarUsa{
    final public int light = 50;
    @Override
    public void drive() {
        System.out.println("BmwX5Usa rides!");

    }

    @Override
    public void basicLightOn() {
        System.out.println("BmwX5Usa xenon on ");

    }

    @Override
    public void basicLightOff() {
        System.out.println("BmwX5Usa xenon off");

    }
}
