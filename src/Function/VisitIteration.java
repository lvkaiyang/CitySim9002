package Function;

import Locations.Location;
import Visitors.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lvkai on 2016/9/30.
 */
public class VisitIteration {
    private ArrayList<String> LocationList;
    private Location location;
    public RandomGenerator randomGenerator;

    public VisitIteration(Location location, int seed) {
        this.location = location;
        ArrayList<String> LocationList = new ArrayList<String>();
        LocationList.add(location.CL);
        LocationList.add(location.SH);
        LocationList.add(location.P);
        LocationList.add(location.DT);
        this.LocationList = LocationList;
        this.randomGenerator = new RandomGenerator(seed);
    }

    public ArrayList<String> TravelIterationPoint() {
        int loop = 0;
        ArrayList<String> TravelList = new ArrayList<String>();
        int IterationTimes = randomGenerator.Output(20) + 1;
        //There shall be no limit on the number of iterations for a given Visitors.Visitor.
        // Specify the range for easier to be displayed
        while (loop < IterationTimes) {
            TravelList.add(LocationList.get(randomGenerator.Output(LocationList.size())));
            loop++;
        }
        return TravelList;
    }

    public void PrintTravelPoints(int VisitorNum, Visitor visitorImp) {
        Iterator PointIterator = TravelIterationPoint().iterator();
        while (PointIterator.hasNext()) {
            String point = PointIterator.next().toString();
            System.out.println("Visitors " + VisitorNum + " is going to " + point + "!");

            if (visitorImp.Preference(location).get(point) == "true")// check if it match person's preference
                System.out.println("Visitors " + VisitorNum + " did like " + point);
            else
                System.out.println("Visitors " + VisitorNum + " did not like " + point);
        }
    }


}
