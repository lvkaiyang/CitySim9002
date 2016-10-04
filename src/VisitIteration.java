import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lvkai on 2016/9/30.
 */
public class VisitIteration {
    public int IterationTimes;
    public ArrayList<String> LocationList;

    public VisitIteration(Location location) {
        Random random = new Random();
        this.IterationTimes = random.nextInt(6) + 1;//There shall be no limit on the number of iterations for a given Visitor.
        ArrayList<String> LocationList = new ArrayList<String>();
        LocationList.add(location.CL);
        LocationList.add(location.SH);
        LocationList.add(location.P);
        LocationList.add(location.DT);
        this.LocationList = LocationList;
    }

    public ArrayList<String> TravelIterationPoint() {
        int loop = 0;
        ArrayList<String> TravelList = new ArrayList<String>();
        Random random = new Random();
        while (loop < IterationTimes) {
            TravelList.add(LocationList.get(random.nextInt(LocationList.size())));
            loop++;
        }
        return TravelList;
    }

}
