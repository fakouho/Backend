package poly.car1;

public class AbCar implements Car {

    @Override
    public void startEngine() {
        System.out.println("AbCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("AbCar.offEngine");
    }
}
