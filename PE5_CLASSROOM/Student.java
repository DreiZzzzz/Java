//package CLASSROOM;

public class Student {
    private final String studentName;
    private double studentGrade;

    public Student(String studentName, double studentGrade) {
        this.setStudentGrade(studentGrade);
        this.studentName = studentName;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentGrade(double studentGrade) {
        this.studentGrade = studentGrade;
    }
}
