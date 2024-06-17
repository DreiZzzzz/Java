import java.util.*; 

// option 1: dd-mm-yy (8 characters)
// option 2: dd-mm-yyyy (10 characters)

// substring(beg,end)

public class DateConverter{
    public static void main(String[] args) {
        String[] monthString = {"Jan", "Feb", "March", "April", "May", "June",
                "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int day = 0, month = 0;
        int year = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date: ");
        String dateHolder = scanner.next();

        if (dateHolder.length() == 8) {
            day = Integer.parseInt(dateHolder.substring(0,2)); // extracts value of index 0-1
            month = Integer.parseInt(dateHolder.substring(3,5));
            year = 2000 + Integer.parseInt(dateHolder.substring(6));
        } else if (dateHolder.length() == 10){
            day = Integer.parseInt(dateHolder.substring(0,2)); // extracts value of index 0-1
            month = Integer.parseInt(dateHolder.substring(3,5));
            year = Integer.parseInt(dateHolder.substring(6));
        } else {
            System.out.println("Invalid Input!");
        }

        System.out.printf("%s %02d %d", monthString[month-1], day, year);
    }
}