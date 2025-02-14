package collectionsproblem.queueinterfaceproblems.reversequeue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import static collectionsproblem.queueinterfaceproblems.reversequeue.ReverseFunction.reverseFunction;

public class ReverseMain {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        q1.add(2);
        q1.add(3);
        q1.add(4);
        reverseFunction(q1);
        System.out.println(q1);
    }
}

