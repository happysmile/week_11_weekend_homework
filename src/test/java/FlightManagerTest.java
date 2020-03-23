import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Passenger francesca;
    Plane plane;
    HashMap<String, String> edinburgh;
    HashMap<String, String> venice;
    String departureTimeDate;


    @Before
    public void before(){
        plane = new Plane();
        plane.setPlaneType(PlaneType.Boeing737);
        edinburgh = new HashMap<String, String>();
        edinburgh.put("EDI", "Edinburgh");
        venice = new HashMap<String, String>();
        venice.put("VEN", "Venice");
        departureTimeDate = "25/03/2020 11:50";
        flight = new Flight(plane, "FR196", venice, edinburgh, departureTimeDate);
        flightManager = new FlightManager(flight);
        francesca = new Passenger("Francesca");
        francesca.addBags(2);
        flight.addAPassenger(francesca);
    }

    @Test
    public void canCalculateHowMuchBaggagePertestPerFlight(){
        assertEquals(192, flightManager.weightAllowancePerPerson());
    }

    @Test
    public void canCalculateHowMuchWeightBookedByPassenger(){
        assertEquals(40, flightManager.weightBookedByPassenger(francesca));
    }

    @Test
    public void canShowFlightCapacity(){
        assertEquals(130, flightManager.getCapacity());
    }

    @Test
    public void canShowTotalWeightAllowedForBags(){
        assertEquals(25000, flightManager.getTotalWeightAllowedForBags());
    }

    @Test
    public void canCalculateRemainingWeightAvailableInFlight(){
        assertEquals(24960, flightManager.remainingWeightAvailable());
    }


}



