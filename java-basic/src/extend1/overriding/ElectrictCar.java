package extend1.overriding;

public class ElectrictCar extends Car {

    @Override
    public void move(){
        System.out.println("전기차가 빠르게 이동합니다.");
    }
    public void charge(){
        System.out.println("충전합니다.");
    }
}
