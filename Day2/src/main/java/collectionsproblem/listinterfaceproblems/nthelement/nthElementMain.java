package collectionsproblem.listinterfaceproblems.nthelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collectionsproblem.listinterfaceproblems.nthelement.nthElement.find;

public class nthElementMain {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,4,5,6,7));
        int target=3;
        find(list,target);
    }
}



