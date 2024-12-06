package ref;




public class Method2 {
    public static void main(String[] args) {
        Student student1= cr("강우석",15,60);
    }
    public static Student cr(String name, int age, int grade){
        Student student= new Student();
        student.name= name;
        student.age=age;
        student.grade=grade;
        return student;
    }

}
