package extend1.ex1;

public class CarMain {
    public static void main(String[] args) {

        ElectricCAR ec = new ElectricCAR();
        ec.move();
        ec.charge();

        GasCar gc = new GasCar();
        gc.move();
        gc.fillup();
    }
}
