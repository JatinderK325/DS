package BinaryTrees.BinaryTreeTakeInputAndPrint;

import java.util.Scanner;

public class BinaryTreeUse {
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

    public static BinaryTree<Integer> takeInput(Scanner s){
        // taking input for root node of a tree. root will always have either 0, 1, or 2 children.
        int rootData;
        System.out.println("Enter root data");
        rootData = s.nextInt();
        // if user enters -1 means node is null.
        if(rootData == -1){
            return null;
        }
        // else create object of tree with data entered bu user
        BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);
        // same steps doing for root's left and right part with the help of recursion for taking inputs for left and right parts.
        root.left = takeInput(s);
        root.right = takeInput(s);

        return root;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTree<Integer> root = takeInput(s);
        printTree(root);
    }
}
