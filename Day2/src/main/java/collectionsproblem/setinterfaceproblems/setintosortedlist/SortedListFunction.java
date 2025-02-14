
package collectionsproblem.setinterfaceproblems.setintosortedlist;

import java.util.Set;
import java.util.TreeSet;

public class SortedListFunction {
    public static TreeSet<Integer> insert(Set<Integer> s1){
        TreeSet<Integer> ans= new TreeSet<>();
        for(int i:s1){
            ans.add(i);
        }
        return ans;
    }
}

