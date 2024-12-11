package poly.ex4;

public class Cat extends AbstarcAnimal implements Eat{

    @Override
    public void eat(){
        System.out.println("Cat.eat");
    }
    @Override
    public void move(){
        System.out.println("Cat.move");
    }


}
