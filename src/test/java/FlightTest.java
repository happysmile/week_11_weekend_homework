import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger francesca;
    Plane plane;
    HashMap<String, String> edinburgh;
    HashMap<String, String> venice;
    String departureTimeDate;

    @Before
    public void before() {
        plane = new Plane();
        plane.setPlaneType(PlaneType.Boeing737);
        edinburgh = new HashMap<String, String>();
        edinburgh.put("EDI", "Edinburgh");
        venice = new HashMap<String, String>();
        venice.put("VEN", "Venice");
        departureTimeDate = "25/03/2020 11:50";
        flight = new Flight(plane, "FR196", venice, edinburgh, departureTimeDate );
    }

    @Test
    public void hasEmptySeats(){
        assertEquals(flight.getCapacity(), flight.getNumberOfEmptySeats());
    }

    @Test
    public void returnsDateTime(){
        assertEquals("25/03/2020 11:50", flight.getDepartureDateTime());
    }

    @Test
    public void canBookPassenger(){
        assertEquals(130, flight.getNumberOfEmptySeats());
        assertEquals(0, flight.getPassengers().size());
        flight.addAPassenger(francesca);
        assertEquals(129, flight.getNumberOfEmptySeats());
        assertEquals(1, flight.getPassengers().size());
    }

}


