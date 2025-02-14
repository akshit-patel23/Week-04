package collectionsproblem.setinterfaceproblems.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class Difference {
    public static Set<Integer> difference(Set<Integer> s1,Set<Integer> s2){
        Set<Integer> ans= new HashSet<>();
        for(int i:s1){
            if(!s2.contains(i)){
                ans.add(i);
            }
        }
        for(int i:s2){
            if(!s1.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}