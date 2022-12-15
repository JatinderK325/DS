package StacksAndQueues.QueueUsingLL;

public class main {
    public static void main(String[] args) throws QueueFullException {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        System.out.println(queue.isEmpty());
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
