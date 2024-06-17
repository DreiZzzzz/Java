public class Person{
	private int age, idNumber; 

	private String collegeProgram; 
	private String firstName, lastName, occupation; 


	Person(String firstName, String lastName, int age, int idNumber) { // teacher
		this.occupation = "Teacher"; 
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setIDNumber(idNumber);
	}
	Person(String firstName, String lastName, int age, int idNumber, String collegeProgram) { // student
		this.occupation = "Student";
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setIDNumber(idNumber);
		setCollegeProgram(collegeProgram);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age; 
	}
	public void setIDNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public void setCollegeProgram(String collegeProgram) {
		this.collegeProgram = collegeProgram; 
	}

	public String getOccupation() {
		return this.occupation;
	}

	public String getStudentInfo() {
		return this.occupation + " - " + this.firstName + " " + this.lastName + "-- " + this.age + " --" + this.idNumber + " (" + this.collegeProgram + ")\n"; 
	}

	public String getTeacherInfo() {
		return this.occupation + " - " + this.firstName + " " + this.lastName + "-- " + this.age + " --" + this.idNumber + "\n";
	}
}