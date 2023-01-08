package BinaryTrees.BinaryTreeTransversal;
import java.util.Scanner;
import BinaryTrees.BinaryTreeTakeInputLevelWise.QueueUsingLL.QueueUsingLL;

public class BinaryTreeUse {
    // printing tree according to In order way i.e Left, root, right
    public static void inOrder(BinaryTree<Integer> root){
        if(root == null){
            return;
        }
    
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


    public static BinaryTree<Integer> takeInputLevelWise(){
        // taking input for root node of a tree. root will always have either 0, 1, or 2 children.
        Scanner s = new Scanner(System.in);
        // making queue to store all the TreeNodes. we used queue becoz we want to take and print data level wise and for this usecase, queue is suitable to implement, becoz queue also works on FIFO principle.
        QueueUsingLL<BinaryTree<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        // if user enters -1 means node is null.
        if(rootData == -1){
            return null;
        }
        // else create object of tree with data entered bu user
        BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
            BinaryTree<Integer> front;
            // deleted first node from queue and stored it in frontNode.
            try {
                front = pendingNodes.dequeue();
            } catch (Exception e) {
                return null;
            }
            System.out.println("Enter left child of " + front.data);
            int leftChild = s.nextInt();
            if(leftChild != -1){
                BinaryTree<Integer> child = new BinaryTree<Integer>(leftChild);
                pendingNodes.enqueue(child);
                front.left = child;
            }
            System.out.println("Enter right child of " + front.data);
            int rightChild = s.nextInt();
            if(rightChild != -1){
                BinaryTree<Integer> child = new BinaryTree<Integer>(rightChild);
                pendingNodes.enqueue(child);
                front.right = child;
            }
            
        }
        return root;
    }
    public static void main(String[] args) {
        BinaryTree<Integer> root = takeInputLevelWise();
        inOrder(root);

    }
}
