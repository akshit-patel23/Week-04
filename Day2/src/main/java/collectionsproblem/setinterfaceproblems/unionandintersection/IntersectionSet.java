package collectionsproblem.setinterfaceproblems.unionandintersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionSet {
    public static Set<Integer> intersection(Set<Integer> s1,Set<Integer> s2){
        Set<Integer> list =new HashSet<>();
        for(int i:s1){
            if(s2.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}