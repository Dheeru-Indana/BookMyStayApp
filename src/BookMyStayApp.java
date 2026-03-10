//UC2
import java.util.*;

abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int numberOfBeds, int squareFeet, double pricePerNight){
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails(){
        System.out.println("No. Of Beds: " + numberOfBeds);
        System.out.println("Square Feet: " + squareFeet);
        System.out.println("Price Per Night: " + pricePerNight);
    }
}

class SingleRoom extends Room{
    public SingleRoom(){
        super(1,250,1500.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom(){
        super(2,400,2500.0);
    }
}

class SuiteRoom extends Room{
    public SuiteRoom(){
        super(3,750,5000.0);
    }
}

public class BookMyStayApp {
    public static void main(String[] args){

        System.out.println("Welcome to the Hotel Booking Management System!");
        System.out.println("System Initialized Successfully!");
        System.out.println("Version 2.0");

        SingleRoom single = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        System.out.println("---- Single Room Details ----");
        single.displayRoomDetails();
        System.out.println("Available Rooms: " + singleRoomAvailable);

        System.out.println("---- Double Room Details ----");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailable);

        System.out.println("---- Suite Room Details ----");
        suite.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteRoomAvailable);
    }
}