package poly.bagic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent pr = new Child();
        pr.parentMethod();

        //다운캐스팅
        Child ch = (Child) pr;
        ch.childMethod();
    }
}
