package collectionsproblem.setinterfaceproblems.unionandintersection;

import java.util.HashSet;
import java.util.Set;

public class UnionSet {
    public static Set<Integer> union(Set<Integer> s1,Set<Integer> s2) {

        Set<Integer> ans=new HashSet<>();
        for(int i:s1){
            ans.add(i);
        }
        for (int i:s2){
            ans.add(i);
        }
        return ans;
    }
}