package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author cgonz
 */
public class Startup {
    public static void main(String[] args) {
        
        Map<String,List<String>>favoriteCars = new HashMap<>();
        
        List favFords = new ArrayList();
        favFords.add("Ford GT");
        favFords.add("Shelby GT350");
        
        List favChevys = new ArrayList();
        favChevys.add("Ford GT");
        favChevys.add("Shelby GT350");
        
                
        favoriteCars.put("Ford", favFords);
        favoriteCars.put("Chevy", favChevys);
        
        List found = favoriteCars.get("Chevy");
        //System.out.println(found);
        //System.out.println(found.get(1));
        
//        Set keys = favoriteCars.keySet();
//        for(Object key : keys){
//            String k = (String)key;
//            System.out.println(k);
//        }



        Collection<List<String>>values = favoriteCars.values();
        for(List value : values){
            List v = value;
            System.out.println(v);
        }
        
    }
}
