package collectionsproblem.setinterfaceproblems.unionandintersection;

import java.util.HashSet;
import java.util.Set;

import static collectionsproblem.setinterfaceproblems.unionandintersection.IntersectionSet.intersection;
import static collectionsproblem.setinterfaceproblems.unionandintersection.UnionSet.union;

public class UnionAndIntersectionMain {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(3);
        s2.add(4);
        Set<Integer> setUnion=union(s1,s2);
        Set<Integer> setIntersection=intersection(s1,s2);
        System.out.println("Union item");
        for(int i:setUnion){
            System.out.println(i);
        }
        System.out.println("Intersection item");
        for(int i:setIntersection){
            System.out.println(i);
        }
    }
}