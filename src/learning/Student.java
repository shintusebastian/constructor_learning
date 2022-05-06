package learning;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String name;
    private String course;
    private String phone;

    public Student(String name, String course, String phone) {
        this.name = name;
        this.course = course;
        this.phone = phone;
    }


    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    public static void main(String[] args) {
Student student=new Student("Shintu", "Java", "650340954");
        System.out.println("6706543".matches("0"));




    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
