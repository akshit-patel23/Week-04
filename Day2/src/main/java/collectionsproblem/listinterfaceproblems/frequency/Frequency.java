
package collectionsproblem.listinterfaceproblems.frequency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency {
    public static Map<String,Integer> frequencyMap(List<String> list){
        Map<String,Integer> mapResult=new HashMap<>();
        for(String item:list){
            mapResult.put(item.toLowerCase(),mapResult.getOrDefault(item.toLowerCase(),0)+1);
        }

        System.out.println(mapResult);
        return mapResult;
    }
}

