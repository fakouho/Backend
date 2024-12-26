package lang.immutable.chage;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj mo = new MutableObj(37);

        mo.add(24);
        System.out.println(mo.getValue());
    }
}
