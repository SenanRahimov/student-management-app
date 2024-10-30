package Lesson;

import java.util.ArrayList;
import java.util.List;

public class Management {
    static List<Student> students = new ArrayList<>();






    public static void displayAllStudents() {
        for (Student student : students)
            System.out.println(student);
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static boolean updateStudent1(Integer id, Integer age, Double grade, String name) {

        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setAge(age);
                student.setGrade(grade);
                student.setName(name);
                System.out.println("Student updated.");
            }
        }

        return false;
    }
    public static void removeStudents(int student) {
        students.remove(student);

    }

    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            students.forEach(System.out::println);
        }
    }

    public static void clearAllStudents() {
        students.clear();
    }

    public static boolean isEmpty() {
        return students.isEmpty();
    }
    public  static boolean findStudentById(Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student find");
            }
        }

        return false;
    }
}
