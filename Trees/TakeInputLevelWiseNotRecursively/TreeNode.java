package Trees.TakeInputLevelWiseNotRecursively;

import java.util.ArrayList;

public class TreeNode<T> { // generic type
    public T data; // data in every tree node
    public ArrayList<TreeNode<T>> children; // Each node can have either one or more or zero children. So making arraylist with nodes inside it<TreeNode<T>>.
    
    public TreeNode(T data){ // constructor
        this.data = data;// we need data while making constructor
        children = new ArrayList<>();
    }
}
