import java.util.Iterator;

/**
 * Created by user on 2016/10/1.
 */
public class Display {
    int seed;
    Location location;

    public Display(int seed) {
        this.seed = seed;
        this.location = new Location();
    }

    public void ShowMessages() {
        int VisitorNum = 1;
        RandomVisitors randomVisitors = new RandomVisitors();
        VisitIteration visitIteration = new VisitIteration(location);
        Iterator VisitorsIterator = randomVisitors.VisitorsList().iterator();
        Iterator PointIterator;
        System.out.println("Welcome to CitySim! Your seed is " + seed + ".");
        while (VisitorsIterator.hasNext()) {
            String visitor = VisitorsIterator.next().toString();
            PointIterator = visitIteration.TravelIterationPoint().iterator();
            Visitor visitorImp = null;
            switch (visitor) {
                case "Blogger": {
                    visitorImp = new Blogger();
                    break;
                }
                case "BusinessPerson": {
                    visitorImp = new BusinessPerson();
                    break;
                }
                case "Student": {
                    visitorImp = new Student();
                    break;
                }
                case "Professor": {
                    visitorImp = new Professor();
                    break;
                }
                default:
                    System.out.println("Error!");
            }
            System.out.println("Visitor " + VisitorNum + " is " + visitor);
            while (PointIterator.hasNext()) {
                String point = PointIterator.next().toString();
                System.out.println("Visitor " + VisitorNum + " is going to " + point + "!");

                if (visitorImp.Preference(location).get(point) == "true")
                    System.out.println("Visitor " + VisitorNum + " did like " + point);
                else
                    System.out.println("Visitor " + VisitorNum + " did not like " + point);
            }
            System.out.println("Visitor " + VisitorNum + " has left the city.");
            System.out.println("***");
            VisitorNum++;
        }
    }
}
