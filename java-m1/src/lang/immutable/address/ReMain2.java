package lang.immutable.address;

public class ReMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴르를 공유할수 있습니다.
        Address a = new Address("서울");
        Address b = new Address("서울");
        
        b.setValue("부산");
    }
}
