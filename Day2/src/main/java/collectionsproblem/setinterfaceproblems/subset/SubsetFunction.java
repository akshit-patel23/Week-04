package collectionsproblem.setinterfaceproblems.subset;

import java.util.Set;

public class SubsetFunction {
    public static boolean subsetFunction(Set<Integer> s1, Set<Integer> s2) {
        return s1.containsAll(s2); // More efficient and readable
    }

}