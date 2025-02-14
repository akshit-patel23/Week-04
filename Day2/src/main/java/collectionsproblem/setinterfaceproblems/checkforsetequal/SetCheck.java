package collectionsproblem.setinterfaceproblems.checkforsetequal;

import java.util.Iterator;
import java.util.Set;

public class SetCheck {
    public static boolean compare(Set<Integer> s1, Set<Integer> s2) {
        boolean ans = true;
        Iterator<Integer> iterator = s1.iterator();
        while (iterator.hasNext()) {
            if(!s2.contains(iterator.next()))
                ans=false;
        }
        return ans;
    }
    public static boolean compareS(Set<Integer> s1, Set<Integer> s2) {
        boolean ans = true;
        for (int i:s1){
            if(!s2.contains(i)){
                ans=false;
            }
        }
        return ans;
    }
}