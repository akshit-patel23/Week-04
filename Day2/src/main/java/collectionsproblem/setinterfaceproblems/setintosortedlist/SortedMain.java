package collectionsproblem.setinterfaceproblems.setintosortedlist;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static collectionsproblem.setinterfaceproblems.setintosortedlist.SortedListFunction.insert;

public class SortedMain {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        s1.add(11);
        s1.add(3);
        s1.add(2);
        s1.add(4);
        TreeSet<Integer> ans=insert(s1);
        System.out.println("the correct order");
        for (int i:ans){
            System.out.println(i);
        }
    }
}