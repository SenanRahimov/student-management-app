package az.ingress;

import java.util.Objects;

public class Management {
    public static void main(String[] args) {
      Student student1=new Student("Senan",90);
      Student student2=new Student("Kenan",85);
        Student student3=new Student("Seid",88);
        System.out.println(student3);
    }
    private static final Student[] STUDENTS = new Student[10];

    public static void getAllStudents() {


        for (Student student : STUDENTS)
            System.out.println(student);

    }
    public static void getAllstudentThanGreaterThen(int grade) {
        for(Student student:STUDENTS)
            if (student.getGrade() > grade) {
                System.out.println(grade);

            }

    }
    public  static  void addStudent(Student student){
        if(Objects.nonNull(student)){
            for(int i=0; i< STUDENTS.length;i++){
                if (Objects.isNull(STUDENTS[i])){
                    STUDENTS[i]=student;
                    break;

                }





            }
        }
    }



}






