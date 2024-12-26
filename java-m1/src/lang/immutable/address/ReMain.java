package lang.immutable.address;

public class ReMain {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴르를 공유할수 있습니다.
        Address a = new Address("서울");
        Address b = a;
        
        b.setValue("부산");
    }
}
