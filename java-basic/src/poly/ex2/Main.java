package poly.ex2;



public class Main {
    public static void main(String[] args) {
        Dog dog  = new Dog();
        Cow cow = new Cow();

        AbstractAnimal[] arr = new AbstractAnimal[]{dog,cow};

        for (int i = 0; i < arr.length ; i++) {
            sound(arr[i]);
        }
    }


    private static void sound(AbstractAnimal animal){
        animal.sound();
    }
}
