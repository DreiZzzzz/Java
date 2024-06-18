public class Student {
	private final String name;
	private double grade;

	public Student(String name, double grade) {
		this.name = name;
		setGrade(grade); 
	}

	public void setGrade(double grade) {
		this.grade = grade; 
	}

	public String getName() {
		return name;
	}
	public double getGrade() {
		return grade; 
	}
}