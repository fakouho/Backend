package poly.car0;

public class Driver {

    private K3Car k3Car;

    public void setK3Car(K3Car k3){
        this.k3Car = k3;
    }

    public void driver(){
        System.out.println("Driver.driver");
        k3Car.offEngine();
        k3Car.startEngine();
    }
}
