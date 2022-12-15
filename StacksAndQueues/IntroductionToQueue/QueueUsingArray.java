package StacksAndQueues.IntroductionToQueue;
 // Queue works on FIFO

public class QueueUsingArray {
    private int data[];
    private int front; // index at which front element is stored
    private int rear; // index at which rear element is stored
    private int size;

    // if user does not give capacity for data array so this constructor will be called and array will be of 10 size.
    public QueueUsingArray(){
        data = new int[10];
        // initially when queue is empty.
        front = -1; 
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        // initially when queue is empty.
        front = -1; 
        rear = -1;
        size = 0;
    }

    // getting size of a queue
    public int size(){
        return size;
    }

    // checking queue is empty or not
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    // getting front of the queue
    public int front() throws QueueEmptyException{
        // if queue is empty
        if(size == 0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    // insertion: Elements get inserted at the rear part of a queue.
    public void enqueue(int element) throws QueueFullException{
        if( size == data.length){
            // throw new QueueFullException();
            doubleCapacity();
        }
        if(size == 0){ // when we are inserting first element in a queue, we need to update front from -1 to 0.
            front = 0;
        }
        rear++;
        // impementing circular queue
        if(rear == data.length){ // if rear reaches last, then send rear to 0 again becoz if there is a space in queue, we can enter new elements in a queue.
            rear = 0;
        }
        size++;
        data[rear] = element;
    }

    private void doubleCapacity() {
        int temp[] = data;
        // increasing size of queue(dynamic queue)
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index] = temp[i];
            index++;
        }
        for (int i = 0; i <= front - 1; i++) {
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length - 1;
    }

    // deletion: Elements get deleted at the front part of a queue.
    public int dequeue() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front++;
        if(front == data.length){
            front = 0;
        }
        size--;
        if(size == 0){
            // setting front and rear to -1 again if size gets 0.
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
