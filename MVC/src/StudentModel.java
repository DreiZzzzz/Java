import java.time.LocalDate;
import java.util.ArrayList;

public class StudentModel {
    private ArrayList<Student> univStudents;

    public StudentModel() {
        this.univStudents = new ArrayList<Student>();
    }
    public boolean addStudents(String name, LocalDate birth, int age, String username, String highschool, String degree, int idNumber, int admissionYear) {
        boolean result = false;
        try {
            this.univStudents(new Student(name, birth, age, username, highschool, degree, idNumber, admissionYear));
            result = true;
        }
        catch(Exception e) {
            System.out.println("Error: " + e);
        }
        return result;
    }
    public ArrayList<Student> getUnivStudents() {
        return this.univStudents;
    }
}
