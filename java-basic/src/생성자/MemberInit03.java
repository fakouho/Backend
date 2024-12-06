package 생성자;

public class MemberInit03 {
    String name;
    int age;
    int grade;

    MemberInit03(String name, int age, int grade){
        System.out.println("생성자 호출 name:"+name+"생성자 나이:"+age+"생성자 등급:"+grade);
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
}
