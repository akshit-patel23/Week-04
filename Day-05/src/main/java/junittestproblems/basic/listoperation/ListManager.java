package junittestproblems.basic.listoperation;

import java.util.ArrayList;
import java.util.List;

public class ListManager {
   public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }
    public static void removeElement(List<Integer> list, int element) throws ElementNotPresent {
        if(!list.contains(element)){
            throw new ElementNotPresent("Please enter valid element");
        }else {
            list.remove(Integer.valueOf(element));
        }
    }
    public static void getSize(List<Integer> list) throws ElementNotPresent {
        if(list.size()==0){
            throw new ElementNotPresent("No element present in list!");
        }
        else {
            System.out.println("The size of list :- "+list.size());
        }

    }

}
