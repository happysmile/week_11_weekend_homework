import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private HashMap<String, String> toAirport;
    private HashMap<String, String> fromAirport;
    private String departureDateTime;

    public Flight(Plane plane, String flightNumber, HashMap<String, String> toAirport, HashMap<String, String> fromAirport, String departureDateTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.toAirport = new HashMap<String, String>();
        this.fromAirport = new HashMap<String, String>();
        this.departureDateTime = departureDateTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int getNumberOfEmptySeats(){
        return (this.plane.getCapacity() - this.passengers.size());
    }

    public int getCapacity(){
        return this.plane.getCapacity();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Plane getPlane() {
        return plane;
    }

    public HashMap<String, String> getFromAirport() {
        return fromAirport;
    }

    public HashMap<String, String> getToAirport() {
        return toAirport;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void addAPassenger(Passenger passenger){
        if ((!this.passengers.contains(passenger))&&(this.getNumberOfEmptySeats()>0)){
            this.passengers.add(passenger);
        }
    }

}
