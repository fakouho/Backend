package poly.ex3;

public class Main {
    public static void main(String[] args) {
        Cat ct = new Cat();

        InterfaceAnimal[] arr = new InterfaceAnimal[]{ct};
        for (int i = 0; i < args.length ; i++) {
            st(arr[i]);
        }
    }

    private static void st(InterfaceAnimal animal){
        animal.move();
        animal.sound();
    }
}
