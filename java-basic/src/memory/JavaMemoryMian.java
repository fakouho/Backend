package memory;

public class JavaMemoryMian {
    public static void main(String[] args) {
        System.out.println("메인스타트");
        method1(10);
        System.out.println("메인 종료");
    }
    static void method1(int m1){
        System.out.println("메모리1 스타트");
        int cal = m1*2;
        method2(cal);
        System.out.println("메모리1 종료");
    }
    static void method2(int m2){
        System.out.println("메모리2 스타트");
        System.out.println("메모리2 종료");
        System.out.println(m2
        );
    }
}
