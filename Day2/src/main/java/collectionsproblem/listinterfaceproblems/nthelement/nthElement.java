package collectionsproblem.listinterfaceproblems.nthelement;

import java.util.List;

public class nthElement {
    public static int find(List<Integer> list, int target){
        int count=0;
        int ans=-1;
        while(target!=0||list.isEmpty()){

            ans=list.getLast();
            list.remove(list.getLast());
            target--;

        }

        System.out.println("The element :- "+ans);
        return ans;
    }
}