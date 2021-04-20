package lection13;

public class Demo {
    public static void main(String[] args) {
        BasicCar bmwX5 = new BmwX5();
        BortCopmuter cp = new BortCopmuter(bmwX5);
        cp.work();

        CarAdapter bmwX5Usa = new CarAdapter(new BmwX5Usa());
        BortCopmuter cpUsa = new BortCopmuter(bmwX5Usa);
        cpUsa.work();
    }

}
