package Lesson;

public class Main {
    public static void main(String[] args) {
        new Student();

        Management.addStudent(new Student("Martinez", 1, 85.5, 20));
        Management.addStudent(new Student("kamran", 2, 90.0, 21));
        Management.addStudent(new Student("Hasan", 3, 78.5, 22));

        Management.displayStudents();
        Management.updateStudent1(2, 21, 92.0, "Senan");

        System.out.println("Is empty: " + Management.isEmpty());

        System.out.println(Management.findStudentById(1));

         Management.removeStudents(2);
         Management.clearAllStudents();

    }
}
