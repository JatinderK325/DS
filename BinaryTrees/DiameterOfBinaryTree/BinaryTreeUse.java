package BinaryTrees.DiameterOfBinaryTree;
import java.util.Scanner;
import BinaryTrees.BinaryTreeTakeInputLevelWise.QueueUsingLL.QueueUsingLL;
// find diameter of a binary tree.
public class BinaryTreeUse {
    public static int diameter(BinaryTree<Integer> root){
        if (root == null) {
            return 0;
        }
        int option1 = height(root.left) + height(root.right); // calling height function
        int option2 = diameter(root.left); // get diameter of left side
        int option3 = diameter(root.right); // get diameter of right side nodes
        return Math.max(option1, Math.max(option2, option3));
    }

    public static int height(BinaryTree<Integer> root) {
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh, rh);
    }

    public static void printTree(BinaryTree<Integer> root){
        /*
                                   1
                        2                    3
                   4        5                        6
         * 1: L2, R3
         * 2: L4, L5
         * 4: 
         * 5:
         * 3: R6
         * 6:
         */
        if(root == null){
            return;
        }
        // converting to string
        String toBePrinted = root.data + "";
        if(root.left != null){
            toBePrinted += "L:" + root.left.data + ",";
        }

        if(root.right != null){
            toBePrinted += "R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        // same steps doing for root's left and right part with the help of recursion for printing left and right parts.
        printTree(root.left);
        printTree(root.right);

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
        printTree(root);
        int ans = diameter(root);
        System.out.println("The diameter of binary tree is: " + ans);
    }
}
