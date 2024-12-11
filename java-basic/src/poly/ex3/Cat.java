package poly.ex3;

public class Cat implements InterfaceAnimal{

    @Override
    public void sound(){
        System.out.println("Cat.sound");
    }

    public void move(){
        System.out.println("Cat.move");
    }
}
