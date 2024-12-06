package memory;

public class JavaMemoruMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }
    static void method1() {
        System.out.println("메소드1 스타트");
        Data dt = new Data(25);
        method2(dt);
        System.out.println("메소드1 종료");
    }

    private static void method2(Data dt2) {
        System.out.println("메서드2 시작");
        System.out.println("메서드2 종료");
        System.out.println("data.value : "+dt2.getValue());
    }

}
