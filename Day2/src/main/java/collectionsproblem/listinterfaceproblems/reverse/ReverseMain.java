package collectionsproblem.listinterfaceproblems.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collectionsproblem.listinterfaceproblems.reverse.Reverse.reverse;

public class ReverseMain {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8));
        List<Integer> result=reverse(list);
        System.out.println(result);
    }
}