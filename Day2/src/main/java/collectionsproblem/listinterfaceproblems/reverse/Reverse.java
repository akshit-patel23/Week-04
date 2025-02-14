package collectionsproblem.listinterfaceproblems.reverse;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static List<Integer> reverse(List<Integer> list){
        List<Integer> result=new ArrayList<>();
        while(!list.isEmpty()){
            int ans=list.getLast();
            result.add(ans);
            list.remove(list.getLast());
        }
        return result;
    }
}