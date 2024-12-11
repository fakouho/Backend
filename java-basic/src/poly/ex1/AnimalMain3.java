package poly.ex1;


public class AnimalMain3 {
    public static void main(String[] args) {
        Animal[] arr = new Animal[] { new Cat(), new Dog(), new Cow() };

        for (int i = 0; i < arr.length; i++) {
            sound(arr[i]);
        }
    }
    public static void sound(Animal animal) {
        animal.sound();
    }
}

