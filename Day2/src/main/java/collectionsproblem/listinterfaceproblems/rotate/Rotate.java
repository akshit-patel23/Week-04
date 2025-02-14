package collectionsproblem.listinterfaceproblems.rotate;

import java.util.ArrayList;
import java.util.List;

public class Rotate {
    public static List<Integer> rotate(List<Integer> list, int rotate){
        List<Integer> result = new ArrayList<>(list.size());

        for (int i = 0; i < list.size(); i++) {
            result.add(0);
        }

        for (int i = 0; i < list.size(); i++) {
            result.set((i + rotate) % list.size(), list.get(i));
        }
        return result;
    }
}