package poly.bagic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent pr = new Child();
        pr.parentMethod();

        ((Child)pr).childMethod();    }
}
