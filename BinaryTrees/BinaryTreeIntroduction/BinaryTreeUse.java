package BinaryTrees.BinaryTreeIntroduction;

public class BinaryTreeUse {
    public static void main(String[] args) {
        /*
         *                      1(root)
         *          2(left)                 3(right)
         */
        BinaryTree<Integer> root = new BinaryTree<Integer>(1);
        BinaryTree<Integer> node1 = new BinaryTree<Integer>(2);
        root.left = node1;
        BinaryTree<Integer> node2 = new BinaryTree<Integer>(3);
        root.right = node2;
    }
}
