package poly.ex1;

public class AnimalMain2 {
    public static void main(String[] args) {
        Cat cat= new Cat();
        Cow cow = new Cow();
        Dog dow = new Dog();
        Animal[] arr = new Animal[] {dow,cat,cow};

        for (int i = 0; i < arr.length ; i++) {
            arr[i].sound();
        }
    }

}
