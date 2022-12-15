package StacksAndQueues.IntroductionToStacks;
 // Stack works on LIFO
public class StackUsingArray {
    // we can use either array or linked list to store data in our stack.
    private int data[];
    private int top; // index of top most element of stack

    // constructor, if user does not give size
    public StackUsingArray(){
        data = new int[10];
        top = -1; // when stack is empty,
    }
    // constructor, if user gives size
    public StackUsingArray(int capacity){
        data = new int[capacity];
        top = -1; // when stack is empty,
    }

    // check stack is empty or not
    public boolean isEmpty(){
        // if(top == -1){
        //     return true;
        // }else{
        //     return false;
        // } 
        // OR
        return(top == -1);
    }

    // get size of stack
    public int size(){
        return top + 1; // -1 + 1 = 0 intially size.
    }

    // get top most element
    public int top() throws StackEmptyExceptiom{
        if(size() == 0){
            StackEmptyExceptiom e = new StackEmptyExceptiom();
            throw e;
        }
        return data[top];
    }

    // both insertion and deletion happens at the top end
    // adding elements in stack
    public void push(int element) throws StackFullException{
        if(size() == data.length){
            // StackFullException e = new StackFullException();
            // throw e;
            doubleCapacity();
        }
        top++; // index 0, initially was -1
        data[top] = element;
    }

    private void doubleCapacity() {
        // increasing the size of an array
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i <= top; i++) {
            data[i] = temp[i];
        }
    }
    // removing top most element from stack
    public int pop() throws StackEmptyExceptiom{
        if(size() == 0){
            StackEmptyExceptiom e = new StackEmptyExceptiom();
            throw e;
        }
        // storing top most element in temp so that we can return the removed element(just to get the element that we removed).
        int temp = data[top];
        top--; // decreasing top so that now the prev element is our top.
        return temp;
    }

}
