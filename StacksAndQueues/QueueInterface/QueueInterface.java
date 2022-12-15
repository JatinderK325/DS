package StacksAndQueues.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    // we have Queue interface that is already implemented in Java collection so we don't need to make objects to make queue of a particular class instead we can use that in-built Queue interface.
    public static void main(String[] args) {
    // LinkedList implements Queue. As we know, we cannot make Objects of an interface(Queue is an interface), so we can make references through linkedlist class that implements Queue.
    Queue<Integer> queue = new LinkedList<>();

    // function to add elements in a queue
    queue.add(10);
    queue.add(20);

    // function to remove elements from a queue
    System.out.println(queue.poll()); // 10 will be removed from queue and will be shown in output as it was the removed element.
    System.out.println(queue.peek()); // gives front element of the queue.
    System.out.println(queue.size());
    }
}
