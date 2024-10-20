package az.ingress;

import java.util.UUID;

public class Student {
    private final String name;
    private final String id;
    private  final int grade;


    public String getName() {
        return name;
    }

    public String getId() {
        return  id;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString( ) {
        return "Student{id="+id+",name="+name+",grade="+grade+'}';
    }

    public Student(String name, int grade) {
        this.name = name;
        id = UUID.randomUUID().toString();
        this.grade = grade;


    }


}


