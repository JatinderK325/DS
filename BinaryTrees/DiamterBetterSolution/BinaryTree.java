package BinaryTrees.DiamterBetterSolution;

public class BinaryTree<T> {
    // Binary trees can have only maximum 2 children - 0, 1, 2
    public T data;
    public BinaryTree<T> left;
    public BinaryTree<T> right;

    public BinaryTree(T data){
        this.data = data;
    }
}
