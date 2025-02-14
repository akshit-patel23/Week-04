package collectionsproblem.listinterfaceproblems.remove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collectionsproblem.listinterfaceproblems.remove.Remove.remove;

public class RemoveMain {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,3,3,3,4,5,6,7,8));
        List<Integer> result=remove(list);
        System.out.println(result);

    }
}


