package collectionsproblem.listinterfaceproblems.frequency;

import java.util.ArrayList;
import java.util.List;

import static collectionsproblem.listinterfaceproblems.frequency.Frequency.frequencyMap;

public class FrequencyMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dev");
        list.add("Singh");
        list.add("Dev");
        frequencyMap(list);
    }
}

