package Trees.TakeInputAndPrintRecursively;

import java.util.Scanner;

public class TreeUse {
    public static TreeNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter next node data");
        int data = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(data);
        System.out.println("Enter number of children for " + data);
        int childCount = s.nextInt();
        // taking data for every child of root node recursively and adding them to root node.
        for (int i = 0; i < childCount; i++) {
            // taking data recursively
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }

        return root;
    }

    public static void print(TreeNode<Integer> root){
        // storing root node's data in str like -> 4 : 
        String str = root.data + ":";
        // 
        for (int i = 0; i < root.children.size(); i++) {
            // getting data of every children like -> 2, 1, 3,
            str = str + root.children.get(i).data + ",";
        }

        System.out.println(str); // 4 : 2, 1, 3, -> means 4 is root with three children 2, 1, 3, 

        // going to each child one by one and print recursively to get the data of their children if these child have children further. 
        // means -> 2: (no child), 
        // 1: 5,6, 
        // 5: (no child)
        // 6: (no child)
        // 3: (no child)
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        TreeNode<Integer> root = takeInput();
        print(root);
    }
}
