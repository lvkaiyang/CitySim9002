package Function;

import java.util.ArrayList;

/**
 * Created by lvkai on 2016/9/30.
 */
public class RandomVisitors {
    public RandomGenerator randomGenerator;

    public RandomVisitors(int seed) {
        this.randomGenerator = new RandomGenerator(seed);
    }

    public ArrayList<String> VisitorsList() {
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> TypeList = new ArrayList<String>();

        TypeList.add("Student");
        TypeList.add("Professor");
        TypeList.add("BusinessPerson");
        TypeList.add("Blogger");
        // Randomly pick one of four people into new arraylist
        for (int i = 0; i < 5; i++) {
            int index = randomGenerator.Output(TypeList.size());
            result.add(TypeList.get(index));
        }
        return result;
    }

}
