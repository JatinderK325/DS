package Trees.FindLargestNodeInTree;

import java.util.Scanner;

import StacksAndQueues.QueueUsingLL.QueueEmptyException;
import StacksAndQueues.QueueUsingLL.QueueUsingLL;

public class TreeUse {

    public static int findLargest(TreeNode<Integer> root){
        if(root == null){ // this is not a base case, it is part of code if our root is initially null then we will return Integer.MIN_VALUE;
            return Integer.MIN_VALUE;
        }
        // assuming root is the largest TreeNode.
        int largest = root.data;
        // getting largest among all children of root TreeNode.
        for (int i = 0; i < root.children.size(); i++) { // here recursion is handling with for loop not a base case.
            int largestChild = findLargest(root.children.get(i));
            // comparing root TreeNode with its children one by one and updating largest
            if (largestChild > largest) {
                largest = largestChild;
            }
        }
        return largest;
    }

    // Now we will take input and print our tree level wise instead of recursively.
    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        // making root node of a Tree with rootData
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        // making queue to store all the TreeNodes. we used queue becoz we want to take and print data level wise and for this usecase, queue is suitable to implement, becoz queue also works on FIFO principle.
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        // adding TreeNodes'data in queue
        pendingNodes.enqueue(root);

        // to take input level wise
        while (!pendingNodes.isEmpty()) {
            try {
                // deleted first node from queue and stored it in frontNode.
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter number of children for " + frontNode.data);
                // storing total number of children in childNumber
                int childNumber = s.nextInt();
                // taking data for every children one by one
                for (int i = 0; i < childNumber; i++) {
                    System.out.println("Enter the " + i + "the child of " + frontNode.data);
                    int data = s.nextInt();
                    // making every child a TreeNode becoz they can have children further.
                    TreeNode<Integer> childNode = new TreeNode<Integer>(data);
                    // adding each child in the frontNode and in the queue.
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                    ;
                }
            } catch (QueueEmptyException e) {
                // will never come here
            }
        }
        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root) {
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
            printLevelWise(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        int n = findLargest(root);
        System.out.println(n);
    }
}
