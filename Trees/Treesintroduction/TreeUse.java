package Trees.Treesintroduction;

public class TreeUse {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(6);
        TreeNode<Integer> node1 = new TreeNode<Integer>(4);
        TreeNode<Integer> node2 = new TreeNode<Integer>(2);
        TreeNode<Integer> node3 = new TreeNode<Integer>(5);
        TreeNode<Integer> node4 = new TreeNode<Integer>(8);

        // root has three children -> node1, node2, node3
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        
        // node2 has one children -> node4
        node2.children.add(node4);
        System.out.println(root);
    }
}
