package collectionsproblem.queueinterfaceproblems.stackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

import static collectionsproblem.queueinterfaceproblems.stackusingqueue.ReverseFunctionForQueue.reverseFunction;

public class StackUsingQueue {
private Queue<Integer> queue=new LinkedList<>();
    private Queue<Integer> temp=new LinkedList<>();

public void push(int value){
    queue.add(value);
    temp.add(value);
    reverseFunction(temp);
}

public Boolean isEmptyQueue(){
    return temp.isEmpty();
}


public int pop(){
return temp.poll();
}
}
