//package CLASSROOM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int classroomLimit, menuOption;
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        System.out.println();
        printAst();
        System.out.print("Enter classroom limit: ");
        classroomLimit = scanner.nextInt();
        scanner.nextLine();

        Classroom classroom = new Classroom(classroomLimit);

        while(!done) {
            displayMenu();
            menuOption = scanner.nextInt();
            scanner.nextLine();

            switch(menuOption) {
                case 1:
                    printAst();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    scanner.nextLine();

                    if(classroom.addStudent(grade, name)) {
                        System.out.println("ADDED STUDENT!");
                    } else {
                        System.out.println("EXCEEDED STUDENT LIMIT!");
                    }
                    break;
                case 2:
                    boolean removeStatus = false;

                    printAst();
                    System.out.println("[REMOVE OPTION]");
                    System.out.println("(1) Enter Name");
                    System.out.println("(2) Enter Index");

                    int removeOption = scanner.nextInt();
                    scanner.nextLine();

                    if (removeOption == 1) {
                        System.out.print("Enter Student Name: ");
                        String removeName = scanner.nextLine();
                        removeStatus = classroom.removeStudent(removeName);
                    }
                    else if (removeOption == 2) {
                        System.out.print("Enter index: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        removeStatus = classroom.removeStudent(index);
                    }

                    if(removeStatus) {
                        System.out.println("REMOVED STUDENT!");
                        classroomLimit--;
                    } else {
                        System.out.println("FAILED TO REMOVE STUDENT!");
                    }
                    break;
                case 3:
                    int i;

                    printAst();
                    if(classroom.getNumOfStudents() == 0) {
                        System.out.println("NO STUDENTS!");
                    } else {
                        System.out.println("[CLASS LIST]\n");
                        for(i = 0; i < classroom.getNumOfStudents(); i++) {
                            System.out.println(classroom.showClassList(i));
                        }
                    }
                    break;
                case 4:
                    printAst();
                    System.out.println("[HIGHEST GRADE]");
                    System.out.println(classroom.getHighestGrade());
                    break;
                case 5:
                    printAst();
                    System.out.println("CLASS AVERAGE: " + classroom.getClassAverage());
                    break;
                case 0:
                    printAst();
                    done = true;
                    break;
            }
        }
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println();
        printAst();
        System.out.println("\t[MENU]");
        System.out.println("(1) Add Student");
        System.out.println("(2) Remove Student");
        System.out.println("(3) Show Class List");
        System.out.println("(4) Get Highest Grade");
        System.out.println("(5) Get Class Average");
        System.out.println("(0) Exit Program");

        System.out.print("\nCHOICE: ");
    }

    public static void printAst() {
        System.out.println("**************************************************************");
    }
}
