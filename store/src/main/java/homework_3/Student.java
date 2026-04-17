package homework_3;

public class Student {
    private String name;
    private int grade;
    private static int totalStudents = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public String getStatus() {
        if (grade >= 90) {
            return "Отлично";
        }
        if (grade >= 70) {
            return "Хорошо";
        }
        if (grade >= 50) {
            return "Удовл.";
        }
        return "Неуд.";
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    @Override
    public String toString() {
        return "Student name=" + name + ", grade=" + grade + ", status=" + getStatus();
    }
}
