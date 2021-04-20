package lection13;

public class CarAdapter implements BasicCar {

    BasicCarUsa basicCarUsa;

    public CarAdapter(BasicCarUsa basicCarUsa) {
        this.basicCarUsa = basicCarUsa;
    }

    @Override
    public void drive() {
        basicCarUsa.drive();

    }

    @Override
    public void xenonOn() {
        basicCarUsa.basicLightOn();

    }

    @Override
    public void xenonOff() {
        basicCarUsa.basicLightOff();

    }
}
