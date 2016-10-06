package Function;

import Locations.Location;
import Visitors.Visitor;

import java.util.Iterator;

/**
 * Created by user on 2016/10/1.
 */
public class Display {
    private int seed;
    public RandomVisitors randomVisitors;
    public VisitIteration visitIteration;

    public Display(int seed) {
        this.seed = seed;
        this.randomVisitors = new RandomVisitors(seed);
        this.visitIteration = new VisitIteration(new Location(), seed);
    }

    public void ShowMessages() {
        int VisitorNum = 1;
        Iterator VisitorsIterator = randomVisitors.VisitorsList().iterator();
        System.out.println("Welcome to CitySim! Your seed is " + seed + ".");
        while (VisitorsIterator.hasNext()) {
            String visitor = VisitorsIterator.next().toString();
            Visitor visitorImp = null;
            //Get the visitor and classify who it is
            switch (visitor) {
                case "Blogger": {
                    visitorImp = new Visitors.Blogger();
                    break;
                }
                case "BusinessPerson": {
                    visitorImp = new Visitors.BusinessPerson();
                    break;
                }
                case "Student": {
                    visitorImp = new Visitors.Student();
                    break;
                }
                case "Professor": {
                    visitorImp = new Visitors.Professor();
                    break;
                }
                default:
                    System.out.println("Error!");
            }
            System.out.println("Visitors " + VisitorNum + " is " + visitor);
            //Print travel point and its preference
            visitIteration.PrintTravelPoints(VisitorNum, visitorImp);
            System.out.println("Visitors " + VisitorNum + " has left the city.");
            System.out.println("***");
            VisitorNum++;
        }
    }
}
