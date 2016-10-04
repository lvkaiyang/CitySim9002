import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lvkai on 2016/9/30.
 */
public class RandomVisitors {
    public ArrayList<String> VisitorsList() {
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> TypeList = new ArrayList<String>();
        Random random = new Random();
        TypeList.add("Student");
        TypeList.add("Professor");
        TypeList.add("BusinessPerson");
        TypeList.add("Blogger");
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(TypeList.size());
            result.add(TypeList.get(index));
        }
        return result;
    }

}
