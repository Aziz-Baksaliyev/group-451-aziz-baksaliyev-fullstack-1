package classwork_4;

import java.util.Objects;

public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Азиз", 7);
        Student s2 = new Student("Азиз", 8);

        System.out.println(s1);

        if (s1.equals(s2)) {
            System.out.println("Студенты равны по имени");
        } else {
            System.out.println("Студенты разные");
        }
    }
}