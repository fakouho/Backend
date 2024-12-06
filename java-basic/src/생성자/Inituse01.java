package 생성자;

public class Inituse01 {
    public static void main(String[] args) {
       MemberInit01 dl = mb("강우석",15,25);
    }
    public static MemberInit01 mb(String st, int age, int grade){
        MemberInit01 mb = new MemberInit01();
        mb.name =st;
        mb.age=age;
        mb.grade=grade;
        return mb;
    }
}
