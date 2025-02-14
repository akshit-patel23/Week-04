package collectionsproblem.queueinterfaceproblems.reversequeue;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReverseFunction {
    public static void reverseFunction(Queue<Integer> q1) {
        if (q1.isEmpty()) {
            return;
        }

        int front = q1.remove();

        reverseFunction(q1);

        q1.add(front);
    }
}