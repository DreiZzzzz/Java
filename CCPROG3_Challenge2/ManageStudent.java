package UMS;

public class ManageStudent {
	private final int idNumber, age, year;
	private final String firstName, lastName, collegeProgram;

	public ManageStudent(int idNumber, String firstName, String lastName, int age, int year, String collegeProgram) {
		this.idNumber = idNumber;
		this.age = age;
		this.year = year;
		this.firstName = firstName;
		this.lastName = lastName;
		this.collegeProgram = collegeProgram;
	}

	public void displayRecord() {
		System.out.println("[" + idNumber + "]" + " " + firstName + " " + lastName + " " + age + " " + year + " " + collegeProgram);
	}
}