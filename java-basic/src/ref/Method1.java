package ref;




public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        sti(student1,"강우석",25,70);



    }
    public static void sti(Student student,String name,int age, int grade){
        student.name=name;
        student.age=age;
        student.grade=grade;

    }
//    public static void printStudent(Student student){
//        System.out.println(student.age);
//    }
}
