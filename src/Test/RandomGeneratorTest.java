package Test;

import Function.RandomGenerator;
import Function.RandomVisitors;
import Function.VisitIteration;
import Locations.Location;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by user on 2016/10/6.
 */
public class RandomGeneratorTest {

    @Test
    public void TestBPReturn() {
        RandomGenerator random = mock(RandomGenerator.class);
        int seed = 34;
        RandomVisitors randomVisitors = new RandomVisitors(seed);
        randomVisitors.randomGenerator = random;
        when(randomVisitors.randomGenerator.Output(4)).thenReturn(2);
        assertEquals(randomVisitors.VisitorsList().get(0), "BusinessPerson");
    }

    //Below tests are used for edge test of RandomVisitors.class
    @Test
    public void TestBlgReturn() {
        RandomGenerator random = mock(RandomGenerator.class);
        int seed = 24;
        RandomVisitors randomVisitors = new RandomVisitors(seed);
        randomVisitors.randomGenerator = random;
        when(randomVisitors.randomGenerator.Output(4)).thenReturn(3);
        assertEquals(randomVisitors.VisitorsList().get(0), "Blogger");
    }

    @Test
    public void TestStuReturn() {
        RandomGenerator random = mock(RandomGenerator.class);
        int seed = 24;
        RandomVisitors randomVisitors = new RandomVisitors(seed);
        randomVisitors.randomGenerator = random;
        when(randomVisitors.randomGenerator.Output(4)).thenReturn(0);
        assertEquals(randomVisitors.VisitorsList().get(0), "Student");
    }

    //Below tests are used for edge test of VisitIteration.class
    @Test
    public void TestCLSave() {
        RandomGenerator random = mock(RandomGenerator.class);
        int seed = 41;
        VisitIteration visitIteration = new VisitIteration(new Location() ,seed);
        visitIteration.randomGenerator = random;
        when(visitIteration.randomGenerator.Output(4)).thenReturn(0);
        assertEquals(visitIteration.TravelIterationPoint().get(0), "The Cathedral of Learning");
    }

    @Test
    public void TestDSave() {
        RandomGenerator random = mock(RandomGenerator.class);
        int seed = 41;
        VisitIteration visitIteration = new VisitIteration(new Location() ,seed);
        visitIteration.randomGenerator = random;
        when(visitIteration.randomGenerator.Output(4)).thenReturn(3);
        assertEquals(visitIteration.TravelIterationPoint().get(0), "Downtown");
    }
}
