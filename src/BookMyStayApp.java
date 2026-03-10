//UC3
import java.util.*;

class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("SingleRoom", 10);
        roomAvailability.put("DoubleRoom", 5);
        roomAvailability.put("SuiteRoom", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}


public class BookMyStayApp {
    public static void main(String[] args){

        System.out.println("Welcome to the Hotel Booking Management System!");
        System.out.println("System Initialized Successfully!");
        System.out.println("Version 3.0");

        RoomInventory inventory = new RoomInventory();

        Map<String, Integer> rooms = inventory.getRoomAvailability();

        for (String roomType : rooms.keySet()) {
            System.out.println(roomType + " : " + rooms.get(roomType));
        }

        inventory.updateAvailability("DoubleRoom", 4);

        System.out.println("Updated Availability");

        for (String roomType : rooms.keySet()) {
            System.out.println(roomType + " : " + rooms.get(roomType));
        }
    }
}