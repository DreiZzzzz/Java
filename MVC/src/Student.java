import java.time.LocalDate;

public class Student {
    private final String name;
    private final LocalDate birth;
    private final int age;
    private final String username;
    private final String highschool;
    private final String degree;
    private final int idNumber;
    private final int admissionYear;
    private String status;
    private int graduationYear;
    private int expulsionYear;

    public Student(String name, LocalDate birth, int age, String username, String highschool, String degree, int idNumber, int admissionYear) {
        this.name = name;
        this.birth = birth;
        this.age = age;
        this.username = username;
        this.highschool = highschool;
        this.degree = degree;
        this.idNumber = idNumber;
        this.admissionYear = admissionYear;
        this.status = "undergraduate";
    }

    public String getClassification(int admissionYear) {
        String[] classification = {"Freshman", "Sophomore", "Junior", "Senior", "Terminal"};
        int temp = -1;

        if (admissionYear == 1) {
            temp += admissionYear;
        } else if (admissionYear == 2) {
            temp += admissionYear;
        } else if (admissionYear == 3) {
            temp += admissionYear;
        } else if (admissionYear == 4) {
            temp += admissionYear;
        } else if (admissionYear >= 5) {
            temp += admissionYear;
        }

        return classification[temp];
    }
    public void changeStatus(String status, int year) {
        if ("Expelled".equals(status)) {
            setStatus(status);
            setExpulsionYear(year);
        } else if ("Graduated".equals(status)) {
            setStatus(status);
            setGraduationYear(year);
        }
    }
    public String displayInfo(int idNumber) {
        if (this.idNumber == idNumber) {
            return   "Name: " + this.name + "\n" +
                     "Date of Birth: " + this.birth + "\n" +
                     "Age: " + this.age + "\n" +
                     "Username: " + this.username + "\n" +
                     "High School: " + this.highschool + "\n" +
                     "Degree: " + this.degree + "\n" +
                     "ID Number: " + this.idNumber + "\n" +
                     "Admission Year: " + this.admissionYear + "\n" +
                     "Status: " + this.status + "\n";
        } else {
            return "!!! ID NUMBER DOES NOT MATCH !!!";
        }
    }
    public String displayInfo(String name) {
        if (this.name.equals(name)) {
            return  "Name: " + this.name + "\n" +
                    "Date of Birth: " + this.birth + "\n" +
                    "Age: " + this.age + "\n" +
                    "Username: " + this.username + "\n" +
                    "High School: " + this.highschool + "\n" +
                    "Degree: " + this.degree + "\n" +
                    "ID Number: " + this.idNumber + "\n" +
                    "Admission Year: " + this.admissionYear + "\n" +
                    "Status: " + this.status + "\n";
        } else {
            return "!!! STUDENT NAME DOES NOT MATCH  !!!";
        }
    }
    public String displayDiploma(int idNumber) {
        if (this.idNumber == idNumber) {
            if ("Graduated".equals(this.status)) {
                 return "Name: " + this.name + "\n" +
                        "Admission Year: " + this.admissionYear + "\n" +
                        "Degree Code: " + this.degree + "\n" +
                        "Graduation Year: " + this.graduationYear;
            } else {
                return "!!! STUDENT HAS NOT YET GRADUATED !!!";
            }
        } else {
            return "!!! ID NUMBER DOES NOT MATCH !!!";
        }
    }
    public String displayDiploma(String name) {
        if (this.name.equals(name)) {
            if("Graduated".equals(this.status)) {
                 return "Name: " + this.name + "\n" +
                        "Admission Year: " + this.admissionYear + "\n" +
                        "Degree Code: " + this.degree + "\n" +
                        "Graduation Year: " + this.graduationYear;
            } else {
                return "!!! STUDENT HAS NOT YET GRADUATED !!!";
            }
        } else {
            return "!!! STUDENT NAME DOES NOT MATCH  !!!";
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void setGraduationYear(int year) {
        this.graduationYear = year;
    }
    public void setExpulsionYear(int year) {
        this.expulsionYear = year;
    }
}
