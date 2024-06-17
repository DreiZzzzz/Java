import java.util.*;

public class UniversityManagement{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nOption = 0; 
		int addOption = 0; 
		ArrayList<Person> personLists = new ArrayList<>(); 

		int age, idNumber; 
		String collegeProgram; 
		String firstName, lastName, occupation; 

		do {
			nOption = managementOptions(scanner);

			switch (nOption) {
				case 1: 
					addOption = scanner.nextInt(); 

					System.out.println("First Name: ");
					firstName = scanner.next();

					System.out.println("Last Name: ");
					lastName = scanner.next();
					
					System.out.println("Age: ");
					age = scanner.nextInt();

					System.out.println("ID: ");
					idNumber = scanner.nextInt();

					if (addOption == 1) {
						System.out.println("College Program: ");
						collegeProgram = scanner.next();

						personLists.add(firstName, lastName, age, idNumber, collegeProgram);
					} else if (addOption == 2) {
						personLists.add(firstName, lastName, age, idNumber);
					} else {
						System.out.println("!!! [INVALID INPUT] !!!");
					}
					break; 
				case 2: 
					for (int i = 0; i < personLists.size(); i++) {
						if (personLists.get(i).getOccupation.equals("Student")) {
							personLists.get(i).getStudentInfo();
						} else {
							personLists.get(i).getTeacherInfo();
						}
					}
					break;
				case 3: 
					System.out.println("!!! [PROGRAM ENDS HERE] !!!");
					break;
			}

		} while(nOption != 3);
	}

	public static int managementOptions(Scanner scanner) {
		int menuOptions = 0; 

		System.out.println("!!! [MENU OPTIONS] !!!");
		System.out.println("1. Add Record [Student/Teacher]");
		System.out.println("2. Display Record"); 
		System.out.println("3. Exit");

		do {
			menuOptions = scanner.nextInt();
		} while(menuOptions > 3 || menuOptions < 1);

		return menuOptions;
	}

	public static int addOptions(Scanner scanner) {
		int addOption = 0; 

		System.out.println("!!! [ADD OPTIONS] !!!");
		System.out.println("1. Add a student");
		System.out.println("2. Add a teacher"); 

		do {
			addOption = scanner.nextInt();
		} while (addOption > 2 || addOption < 1);

		return addOption; 
	}
}