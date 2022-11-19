package LinkedLists.InsertNewNode;

public class Node<T> {
    // each node holds two things: 1. data  2. address of the next node in the list.
    T data; // data
    Node<T> next; // reference to the next node

    public Node(T data){
        this.data = data;
        next = null;
    }
}
