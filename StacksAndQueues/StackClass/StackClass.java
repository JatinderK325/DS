package StacksAndQueues.StackClass;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        // we have Stack class that is already implemented in Java collection so we don't need to make objects to make stack of a particular class instead we can use that in-built Stack class.
        Stack<Integer> stack = new Stack<>();
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            // push function to add elements in a stack
            stack.push(arr[i]);
        }
        // deleting elements using stack's pop function
        while(!stack.isEmpty()){
            // peek = top most element
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
