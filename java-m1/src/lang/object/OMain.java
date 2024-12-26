package lang.object;

public class OMain {
    public static void main(String[] args) {
        Child c = new Child();
        Parent P = new Parent();
        c.childMethod();
        P.parentMethod();

        String st = c.toString();

        System.out.println(st);
    }
}
