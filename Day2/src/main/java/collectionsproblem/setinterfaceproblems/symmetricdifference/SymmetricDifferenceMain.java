package collectionsproblem.setinterfaceproblems.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

import static collectionsproblem.setinterfaceproblems.symmetricdifference.Difference.difference;

public class SymmetricDifferenceMain {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(3);
        s2.add(4);
        Set<Integer> ans = difference(s1,s2);
        System.out.println("Symmetric Difference");
        for(int i:ans){
            System.out.println(i);
        }
    }
}