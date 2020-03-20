import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger francesca;

    @Before
    public void before(){
        francesca = new Passenger("Francesca");
    }

    @Test
    public void hasName(){
        assertEquals("Francesca", francesca.getName());
    }

    @Test
    public void canAddBags(){
        assertEquals(0, francesca.getNumberOfBags());
        francesca.addBags(2);
        assertEquals(2, francesca.getNumberOfBags());
    }


}
