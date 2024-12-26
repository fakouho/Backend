package lang.object.poly;

public class PMain2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Car c = new Car();
        Object o = new Object();

        Object [] o2 = {d,c,o};

        size(o2);
    }
    private static void size(Object[] o3){
        System.out.println(o3.length);
    }
}
