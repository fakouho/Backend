package lang.immutable.address;

public class PrimitivMain {
    public static void main(String[] args) {
        //기본형 : 절대로 같은 값을 공유하지 않음
        int a = 10;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        b=20;


    }
}
