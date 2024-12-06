package 생성자;

public class MemberInit04 {
    //생성자 오버로딩 개념
    String name;
    int age;
    int grade;

    MemberInit04(String name, int age){
        this(name,age,50);
//        this.name=name;
//        this.age=age;
//        this.grade=50; //디폴트 값을 넣을수도 있음
    }

    MemberInit04(String name, int age, int grade){
        System.out.println("생성자 호출 name:"+name+"생성자 나이:"+age+"생성자 등급:"+grade);
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
}
