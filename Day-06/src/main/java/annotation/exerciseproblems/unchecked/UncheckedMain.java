package annotation.exerciseproblems.unchecked;

import java.util.ArrayList;
import java.util.List;

public class UncheckedMain {
    @SuppressWarnings("unchecked")// wornings ko avoid krne ke liye use krte hai
    public static void main(String[] args) {
        List arr=new ArrayList();
        arr.add("hello");
        arr.add(43);
        System.out.println("List :- "+arr);
    }
}
