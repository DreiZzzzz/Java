import java.util.ArrayList;
import java.util.List;

/**
 * Room class that holds the attributes of a room
 */
public class Room {
    /**
     * 3 attributes of the class
     */
    private final int roomNumber;
    private double roomPricePerNight;
    private List<Reservation> roomReservation; // Declares a List of reservation in a room

    /**
     * The sole constructor of the Room class.
     *
     * @param roomNumber - an integer value indicating the room identification or name
     * @param roomPricePerNight - an integer value that stores the price of the room per night
     */
    public Room(int roomNumber, double roomPricePerNight) {
        // Assigns the parameters to this class' attributes using the "this" keyword
        this.roomNumber = roomNumber;
        this.roomPricePerNight = roomPricePerNight;
        this.roomReservation = new ArrayList<>(); // Initializes a new Array List for room reservations
    }

    /**
     * bookStatus method that returns a boolean value depending on the room reservation's status
     *
     * @return roomReservation - an instance of the Reservation class
     */
    public boolean bookStatus() { //edit
        return !roomReservation.isEmpty(); // Returns true
    }

    /**
     * removeReservation method that sets the roomReservation of the class to null
     *
     * @param roomReservation - reservation made by the user
     */
    public void removeReservation(Reservation roomReservation) {
        this.roomReservation.remove(roomReservation); // Removes a reservation from the reservation list
    }

    /**
     * getReservation method that returns the roomReservation
     *
     * @return roomReservation - an instance of the Reservation class
     */
    public List<Reservation> getReservation() {
        return roomReservation;
    }

    /**
     * getRoomNumber method that returns the room identification or name
     *
     * @return roomNumber - an integer value that corresponds to the room identification or name
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * getRoomPricePerNight method that returns the price of the room per night
     *
     * @return roomPricePerNight - an integer value that corresponds to the price of the room per night
     */
    public double getRoomPricePerNight() {
        return roomPricePerNight;
    }

    /**
     * setReservation method that accepts a room reservation
     *
     * @param roomReservation - an instance of the Reservation class
     */
    public void setReservation(Reservation roomReservation) {
        this.roomReservation.add(roomReservation); // Adds a reservation after it was made
    }

    /**
     * setRoomPricePerNight method that accepts a double and assign it to the class own roomPricePerNight
     *
     * @param roomPricePerNight - an integer value that corresponds to the new price of the room per night
     */
    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }
}
