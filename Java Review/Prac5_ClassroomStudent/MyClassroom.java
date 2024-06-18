import java.util.*; 

public class MyClassroom {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean loop = false; 

		int classOptions; 


		System.out.print("\nSet classroom limit: ");
		int roomLimit = scanner.nextInt();



		Classroom classroom = new Classroom(roomLimit); 
		ArrayList<Student> studentList;


		while(!loop) {
			printAst();
			classOptions = classOptions(scanner); 

			scanner.nextLine(); // buffer

			printAst();
			switch(classOptions) {
				case 1: 
					System.out.println("!!! [ADD A STUDENT] !!!");

					System.out.print("\nStudent name: ");
					String studentName = scanner.nextLine(); 


					System.out.print("\nStudent grade: ");
					double studentGrade = scanner.nextDouble(); 

					Student tempStudent = new Student(studentName, studentGrade);

					if (classroom.addStudent(tempStudent)) {
						System.out.println("\n!!! [STUDENT ADDITION SUCCESFFUL] !!!");
					} else {
						System.out.println("\n!!! [CLASSROOM HAS ALREADY REACH IT'S LIMIT] !!!");
					}
					break;
				case 2: 
					System.out.println("!!! [REMOVE A STUDENT] !!!");

					System.out.println("(1) Remove by name");
					System.out.println("(2) Remove by index");
					System.out.print("\nChoice: ");
					int removeOption = scanner.nextInt();  

					if (removeOption == 1) {
						scanner.nextLine(); // input buffer;
						System.out.print("\nEnter name: ");
						String name = scanner.nextLine();
						if (classroom.removeStudent(name)) {
							System.out.println("\n!!! [STUDENT REMOVAL SUCCESFFUL] !!!");
						} else {
							System.out.println("\n!!! [STUDENT REMOVAL NOT SUCCESFFUL] !!!");
						}
					} else if (removeOption == 2) {
						System.out.print("\nEnter index: ");
						int index = scanner.nextInt();
						if (classroom.removeStudent(index)) {
							System.out.println("\n!!! [STUDENT REMOVAL SUCCESFFUL] !!!");
						} else {
							System.out.println("\n!!! [STUDENT REMOVAL UNSUCCESFFUL] !!!");
						}
					}

					break;
				case 3: 
					studentList = classroom.getClassList();
					System.out.println("!!! [CLASSLIST] !!!");
					for (int i = 0; i < studentList.size(); i++) {
						System.out.println(studentList.get(i).getName() + "  " + studentList.get(i).getGrade());
					}
					break;
				case 4: 
					Student student = classroom.getHighestGrade(); 
					System.out.println("!!! [STUDENT WITH THE HIGHEST GRADE] !!!");
					System.out.println(student.getName() + "  " + student.getGrade()); 
					break;
				case 5: 
					System.out.println("!!! [CLASS AVERAGE] !!!");
					System.out.println("AVE: " + classroom.getClassAverage());
					break; 
				case 6: 
					loop = true; // this will end the loop
					break; 
			}
		}

		System.out.println("!!! [PROGRAM ENDED] !!!");
	}

	public static int classOptions(Scanner scanner) {
		int options = 0; 

		System.out.println("!!! [CLASSROOM OPTIONS] !!!");
		System.out.println("(1) Add a student");
		System.out.println("(2) Remove a student");
		System.out.println("(3) Get class list");
		System.out.println("(4) Get student with highest grade");
		System.out.println("(5) Get class average");
		System.out.println("(6) Exit program"); 

		System.out.print("\nChoice: ");

		do {
			options = scanner.nextInt();
		} while(options > 6 || options < 1);

		return options; 
	}

	public static void printAst() {
		System.out.println("****************************************");
	}
}