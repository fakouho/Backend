package extend1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectrictCar ec = new ElectrictCar();
        GasCar gc = new GasCar();
        ec.charge();
        ec.move();
        gc.full();
        gc.move();
    }
}
