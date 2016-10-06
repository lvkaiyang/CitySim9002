package Test;
import Locations.Location;
import Function.VisitIteration;
import org.junit.Test;

import java.util.Iterator;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 2016/10/6.
 */
public class VisitIterationTest {
    @Test
    public void ListNotNull(){
        int seed = 78;
        VisitIteration visitIteration = new VisitIteration(new Location(),seed);
        Iterator PointIterator = visitIteration.TravelIterationPoint().iterator();
        assertNotNull(PointIterator);
    }
}
