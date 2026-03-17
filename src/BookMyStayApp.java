//UC4

import java.util.HashMap;
import java.util.Map;

class Room {

    String type;
    int beds;
    int size;
    double price;

    Room(String type, int beds, int size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    void displayRoom(int available) {
        System.out.println(type + " Room:");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price per night: " + price);
        System.out.println("Available: " + available);
        System.out.println();
    }
}

class RoomInventory {

    Map<String, Integer> availability = new HashMap<>();

    RoomInventory() {
        availability.put("Single", 5);
        availability.put("Double", 3);
        availability.put("Suite", 2);
    }

    Map<String, Integer> getAvailability() {
        return availability;
    }
}

class RoomSearchService {

    void searchRooms(RoomInventory inventory, Room single, Room dbl, Room suite) {

        Map<String, Integer> a = inventory.getAvailability();

        System.out.println("Room Search\n");

        if (a.get("Single") > 0)
            single.displayRoom(a.get("Single"));

        if (a.get("Double") > 0)
            dbl.displayRoom(a.get("Double"));

        if (a.get("Suite") > 0)
            suite.displayRoom(a.get("Suite"));
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        Room single = new Room("Single", 1, 250, 1500.0);
        Room dbl = new Room("Double", 2, 400, 2500.0);
        Room suite = new Room("Suite", 3, 750, 5000.0);

        RoomInventory inventory = new RoomInventory();

        RoomSearchService service = new RoomSearchService();

        service.searchRooms(inventory, single, dbl, suite);
    }
}