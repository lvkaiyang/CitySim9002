package Test;

import Function.Display;
import Function.RandomVisitors;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertTrue;

/**
 * Created by user on 2016/10/6.
 */
public class RandomVisitorsTest {
    @Test
    public void ListReturnedWithoutNull() {
        int seed = 56;
        Display display = new Display(seed);
        RandomVisitors randomVisitors = new RandomVisitors(seed);
        display.randomVisitors = randomVisitors;
        Iterator iterator = display.randomVisitors.VisitorsList().iterator();
        assertTrue(iterator.hasNext());
    }
}
