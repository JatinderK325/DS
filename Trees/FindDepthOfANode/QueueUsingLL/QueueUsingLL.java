package Trees.FindDepthOfANode.QueueUsingLL;

public class QueueUsingLL<T> {
    // we are usinglinked list to store data in our queue.
    private Node<T> front;
    private Node<T> rear;
    private int size; 

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0; // when queue is empty,
    }

    // check queue is empty or not
    public boolean isEmpty(){
        // if(size == 0){
        //     return true;
        // }else{
        //     return false;
        // } 
        // OR
        return(size == 0);
    }

    // get size of stack
    public int size(){
        return size; 
    }

    // get front element
    public T front() throws QueueEmptyException{
        if(size == 0){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        return front.data;
    }

    // adding elements in queue
    public void enqueue(T element){
        Node<T> newNode = new Node<T>(element);
        if(rear == null){ // initially queue is empty, so after making first newNode, we can update both front and rear.
            front = newNode;
            rear = newNode;
        }
        else{
        rear.next = newNode; // inserting new node in the next part of front so making connection between new node and front like: front->front.next->newNode so on
        rear = newNode; // update rear becoz new node is attached in rear.next so new node is rear now.
        }
        size++; // increasing size after insertion
    }

    // removing element from queue
    public T dequeue() throws QueueEmptyException{
        if(size() == 0){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        // storing front  element in temp so that we can return the removed element(just to get the element that we removed).
        T temp = front.data; 
        front   = front.next; // updating front
        if(size == 1){ // means if we are removing last element of a queue becoz size = 1 i.e there is one element left 
            rear = null;
        }
        size--; // decresing size after deletion
        return temp;
    }

}
