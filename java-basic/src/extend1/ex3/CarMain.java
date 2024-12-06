package extend1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectrictCar ec = new ElectrictCar();
        GasCar gc = new GasCar();
        HydrogenCar hc = new HydrogenCar();
        ec.charge();
        ec.move();
        gc.full();
        gc.move();
        hc.hfull();
        hc.openDoor();
    }
}
