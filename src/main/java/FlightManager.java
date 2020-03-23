import java.util.HashMap;

public class FlightManager {

    private int baggageWeight;
    private Flight flight;


    public FlightManager(Flight flight) {
         this.baggageWeight = 20;
         this.flight = flight;
    }

    public PlaneType getPlaneType(){
        return this.flight.getPlane().getPlaneType();
    }

    public int getCapacity(){
        PlaneType planeType = this.getPlaneType();
        return planeType.getCapacity();
    }

    public int getTotalWeightAllowedForBags(){
        PlaneType planeType = this.getPlaneType();
        return Math.round(planeType.getTotalWeight()/2);
    }


    public int weightAllowancePerPerson(){
        int capacity = this.getCapacity();
        int totalWeightAllowedForBags = this.getTotalWeightAllowedForBags();
        return Math.round(totalWeightAllowedForBags/ capacity);
    }

    public int weightBookedByPassenger(Passenger passenger){
        return this.baggageWeight * passenger.getNumberOfBags();
    }

    public int remainingWeightAvailable(){
        int totalWeightUsedByPassengers = 0;
        for(Passenger passenger : this.flight.getPassengers()){
            totalWeightUsedByPassengers += this.weightBookedByPassenger(passenger);
        }
        return (this.getTotalWeightAllowedForBags() - totalWeightUsedByPassengers);
    }

}


//    Create a FlightManager class which has methods to:
//
//        calculate how much baggage weight should be reserved for each passenger for a flight
//        calculate how much baggage weight is booked by passengers of a flight
//        calculate how much overall weight reserved for baggage remains for a flight
