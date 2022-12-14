package StacksAndQueues.IntroductionToQueue;

public class main {
    public static void main(String[] args) throws QueueFullException {
        QueueUsingArray queue = new QueueUsingArray();
        
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }

        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (Exception e) {
            }
        }
    }
}
