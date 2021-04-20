package lection13;

public class BortCopmuter {
    private BasicCar car;

    public BortCopmuter(BasicCar car) {
        this.car = car;
    }

    public void work() {
        car.drive();
        car.xenonOn();
        car.xenonOff();
    }
}

