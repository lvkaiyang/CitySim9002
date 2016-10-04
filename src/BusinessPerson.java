import java.util.HashMap;
import java.util.Map;

/**
 * Created by lvkai on 2016/9/30.
 */
public class BusinessPerson implements Visitor {
    public Map<String, String> Preference(Location location) {
        Map<String, String> result = new HashMap<String, String>();
        result.put(location.CL, "false");
        result.put(location.DT, "true");
        result.put(location.SH, "true");
        result.put(location.P, "false");
        return result;
    }
}
