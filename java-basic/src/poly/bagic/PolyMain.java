package poly.bagic;

public class PolyMain {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.parentMethod();
        ch.childMethod();

        Parent pr = new Child();
        pr.parentMethod();
    }
}
