package Visitors;

import Locations.Location;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lvkai on 2016/9/30.
 */
public class Professor implements Visitor {
    public Map<String, String> Preference(Location location) {
        Map<String, String> result = new HashMap<String, String>();
        result.put(location.CL, "true");
        result.put(location.DT, "true");
        result.put(location.SH, "true");
        result.put(location.P, "true");
        return result;
    }
}
