//package CLASSROOM;
import java.util.ArrayList;

public class Classroom {
    private ArrayList<Student> studentList = new ArrayList<>();
    private int classroomLimit;

    public Classroom(int classroomLimit) {
        this.classroomLimit = classroomLimit;
    }

    public boolean addStudent(double studentGrade, String studentName) {
        int totalStudents = studentList.size();

        totalStudents++;

            if (totalStudents <= classroomLimit) {
                studentList.add(new Student(studentName, studentGrade));
                return true;
            }

        return false;
    }

    public boolean removeStudent(String studentName) {
        int i;
        Student studentToRemove = null;
        boolean found = false;

        for(i = 0; i < studentList.size() && !found; i++) {
            studentToRemove = studentList.get(i);
            if(studentName.equals(studentToRemove.getStudentName())) {
                found = true;
            }
        }
        
        if(found) {
            studentList.remove(studentToRemove);
            return true;
        }

        return false;
    }

    public boolean removeStudent(int studentIndex) {
        if (studentIndex < studentList.size() && studentIndex >= 0) {
            studentList.remove(studentIndex);
            return true;
        }

        return false;
    }

    public String showClassList (int index) {
        return "Name: " + studentList.get(index).getStudentName() + " -- " + studentList.get(index).getStudentGrade();
    }

    public String getHighestGrade() {
        Student highestStudent = studentList.get(0);
        int i;

        for(i = 1; i < studentList.size(); i++) {
            if(studentList.get(i).getStudentGrade() > highestStudent.getStudentGrade()) {
                highestStudent = studentList.get(i);
            }
        }

        return "Student Name: " + highestStudent.getStudentName() + " -- " + highestStudent.getStudentGrade();
    }

    public double getClassAverage() {
        int i;
        double average, sum = 0.0;

        for (i = 0; i < studentList.size(); i++) {
            sum += studentList.get(i).getStudentGrade();
        }

        average = sum / studentList.size();

        return average;
    }

    public int getNumOfStudents() {
        return studentList.size();
    }

}
