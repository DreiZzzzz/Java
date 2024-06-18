import java.util.*;

public class Classroom {
	private int roomLimit; 
	ArrayList<Student> studentList = new ArrayList<Student>(); 

	public Classroom(int roomLimit) {
		this.roomLimit = roomLimit;
	}

	public boolean addStudent(Student student) {

		int studentCount = studentList.size(); 
		studentCount++; 

		if (roomLimit >= studentCount) {
			studentList.add(new Student(student.getName(), student.getGrade())); 
			return true;
		} else {
			return false; 
		}
	}
	public boolean removeStudent(String name) {

		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getName().equals(name)) {
				studentList.remove(i);
				return true; 
			}
		}
		return false; 
	}
	public boolean removeStudent(int index) {

		if (studentList.size() >= 1) {
			if (index >= 0 && index < studentList.size()) {
				studentList.remove(index);
				return true; 
			} else {
				return false; 
			}
		}
		return false; // list is empty
	}

	public ArrayList<Student> getClassList() {
		return studentList;
	}
	public Student getHighestGrade() {
		int highestIndex = 0; // assume highest is at index 0

		for (int i = 1; i < studentList.size(); i++) {
			if (studentList.get(highestIndex).getGrade() < studentList.get(i).getGrade()) {
				highestIndex = i; 
			}
		}

		return studentList.get(highestIndex); 
	}
	public double getClassAverage() {
		double sum = 0.0;
		double average = 0.0;

		for (int i = 0 ; i < studentList.size(); i++) {
			sum += studentList.get(i).getGrade(); 
		} 

		average = sum / studentList.size(); 

		return average; 
	}
}