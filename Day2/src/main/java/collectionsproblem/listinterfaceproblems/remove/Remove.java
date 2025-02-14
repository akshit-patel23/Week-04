package collectionsproblem.listinterfaceproblems.remove;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    public static List<Integer> remove(List<Integer> list){
        List<Integer> result=new ArrayList<>();
        for(int item:list){
            if(!result.contains(item)){
                result.add(item);
            }
        }
        return result;
    }
}