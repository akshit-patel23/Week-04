package junittestproblems.basic.listoperation;

import java.util.ArrayList;
import java.util.List;

import static junittestproblems.basic.listoperation.ListManager.*;

public class ListManagerMain {
    public static void main(String[] args) throws ElementNotPresent{
        List<Integer> list=new ArrayList<>();
        try {
            addElement(list,4);
            addElement(list,3);
            addElement(list,5);
            addElement(list,7);
            removeElement(list,5);
            getSize(list);

        }catch (ElementNotPresent e){
            System.out.println("Error :- "+e.getMessage());
        }

    }
}
