import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane();
        plane.setPlaneType(PlaneType.Boeing737);
    }

    @Test
    public void hasCapacity(){
        assertEquals(130, plane.getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(500, plane.getTotalWeight());
    }




}
