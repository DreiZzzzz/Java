package UMS;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstName, lastName, collegeProgram;
		int i, age, year, idNumber, choice, studentCount = 0;
		boolean menuLoop = true;
		ManageStudent[] manageStudent = new ManageStudent[1000];

		while(menuLoop) {
			System.out.println("[UNIVERSITY MANAGEMENT SYSTEM]");
			System.out.println("(1) - Add Student");
			System.out.println("(2) - Display All Record");
			System.out.println("(0) - Exit Program");
			System.out.print("CHOICE: ");
			choice = scanner.nextInt();	
			scanner.nextLine();

			System.out.println();
			switch(choice) {
				case 1:
					System.out.print("ID NUMBER: ");
					idNumber = scanner.nextInt();
					scanner.nextLine();

					System.out.print("FIRST NAME: ");
					firstName = scanner.nextLine();

					System.out.print("LAST NAME: ");
					lastName = scanner.nextLine();

					System.out.print("AGE: ");
					age = scanner.nextInt();

					System.out.print("YEAR: ");
					year = scanner.nextInt();
					scanner.nextLine();

					System.out.print("COLLEGE PROGRAM: ");
					collegeProgram = scanner.nextLine();

					manageStudent[studentCount] = new ManageStudent(idNumber, firstName, lastName, age, year, collegeProgram);
					studentCount++;
					System.out.println();
					break;
				case 2:
					System.out.println();
					System.out.println("[STUDENT RECORDS - " + studentCount + "]");
					if(studentCount == 0) {
						System.out.println("! ! ! NO RECORDS ! ! !");
						System.out.println();
					} else {
						for(i = 0; i < studentCount; i++) {
							manageStudent[i].displayRecord();
							System.out.println();
						}
					}
					break;
				case 0:
					System.out.println("! ! ! PROGRAM TERMINATED ! ! !");
					System.out.println();
					menuLoop = false;
					break;	
			}
		}

		scanner.close();
	}
}