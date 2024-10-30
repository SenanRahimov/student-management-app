package Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {
    String name;
    Integer id;
    Double grade;
    Integer age;

    public Student() {

    }

    public Student(String name, Integer id, Double grade, Integer age) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.age = age;
    }

    public Student(String name, Integer id) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;


    }
    @Override
    public String toString() {
        return "Student{name='%s', id=%d, grade=%s, age=%d}".formatted(name, id, grade, age);
    }

}

