package StacksAndQueues.StackUsingLL;

public class StackUsingLL<T> {
    // we are usinglinked list to store data in our stack.
    private Node<T> head;
    private int size; 

    public StackUsingLL(){
        head = null;
        size = 0; // when stack is empty,
    }

    // check stack is empty or not
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

    // get top most element
    public T top() throws StackEmptyExceptiom{
        if(size == 0){
            StackEmptyExceptiom e = new StackEmptyExceptiom();
            throw e;
        }
        return head.data;
    }

    // adding elements in stack
    public void push(T element){
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // removing top most element from stack
    public T pop() throws StackEmptyExceptiom{
        if(size() == 0){
            StackEmptyExceptiom e = new StackEmptyExceptiom();
            throw e;
        }
        // storing top most element in temp so that we can return the removed element(just to get the element that we removed).
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

}
