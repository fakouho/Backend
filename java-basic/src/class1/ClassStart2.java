package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        Student student1;
        student1= new Student();
        student1.name="학생1";
        student1.age=15;
        student1.grade=87;

        Student student2;
        student2= new Student();
        student2.name="학생1";
        student2.age=15;
        student2.grade=87;

        Student[] students= new Student[]{student1,student2};
        for (int i = 0; i <students.length ; i++) {
            System.out.printf("이름 : "+students[i].name);
        }

    }
}
