package poly.ex1;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat= new Cat();
        Cow cow = new Cow();
        Dog dow = new Dog();

       soundA(cat);
       soundA(cow);
    }
    private static void soundA(Animal animal){
        animal.sound();
    }
}
