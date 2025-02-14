package collectionsproblem.setinterfaceproblems.checkforsetequal;

import java.util.HashSet;
import java.util.Set;

import static collectionsproblem.setinterfaceproblems.checkforsetequal.SetCheck.compare;
import static collectionsproblem.setinterfaceproblems.checkforsetequal.SetCheck.compareS;

public class SetCompareMain {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(3);
        s2.add(2);
        s2.add(1);
        System.out.println(compare(s1,s2));
    }
}
