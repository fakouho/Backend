package final1;

public class FinalMain {
    public static void main(String[] args) {
        //생성자 초기화
        ConstructInit db = new ConstructInit(20);
        System.out.println(db.value);

        //필드 초기화
        FieldInIt dt = new FieldInIt();
        //dt.value2=20; -> 불가능

        //상수
        System.out.println(FieldInIt.VALUE1);
    }
}
