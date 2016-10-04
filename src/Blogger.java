import java.util.HashMap;
import java.util.Map;

/**
 * Created by lvkai on 2016/9/30.
 */
public class Blogger implements Visitor {
    public Map<String, String> Preference(Location location) {
        Map<String, String> result = new HashMap<String, String>();
        result.put(location.CL, "false");
        result.put(location.DT, "false");
        result.put(location.SH, "false");
        result.put(location.P, "false");
        return result;
    }
}
