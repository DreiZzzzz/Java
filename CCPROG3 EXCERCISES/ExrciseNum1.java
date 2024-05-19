import java.util.Scanner;

public class ExerciseNum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] monthName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                              "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        // date input format 1: dd-mm-yyyy
        // date input format 2: dd-mm-yy
        String dateInput = sc.next();
        int day = Integer.parseInt(dateInput.substring(0, 2));
        int month = Integer.parseInt(dateInput.substring(3,5));
        int year = 0;

        if (dateInput.length() == 10) {
            year = Integer.parseInt(dateInput.substring(6));
        }
        else if (dateInput.length() == 8) {
            year = Integer.parseInt(dateInput.substring(6));
            year += 2000;
        }

        System.out.printf("%s ", monthName[month - 1]);
        System.out.printf("%02d,", day);
        System.out.printf("%d", year);

    }
}
