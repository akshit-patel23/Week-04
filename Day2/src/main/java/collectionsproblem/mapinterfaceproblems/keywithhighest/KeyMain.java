package collectionsproblem.mapinterfaceproblems.keywithhighest;

import java.util.HashMap;
import java.util.Map;

import static collectionsproblem.mapinterfaceproblems.keywithhighest.KeyWithHighest.maxKey;

public class KeyMain {
    public static void main(String[] args) {
        Map<String,Integer> input=new HashMap<>();
        input.put("A",10);
        input.put("B",40);
        input.put("C",20);
        maxKey(input);
    }
}
