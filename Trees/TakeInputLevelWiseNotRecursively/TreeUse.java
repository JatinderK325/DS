package Trees.TakeInputLevelWiseNotRecursively;

import java.util.Scanner;

import StacksAndQueues.QueueUsingLL.QueueEmptyException;
import StacksAndQueues.QueueUsingLL.QueueUsingLL;

public class TreeUse {
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
                System.out.println("Enter number of children for" + frontNode.data);
                // storing total number of children in childNumber
                int childNumber = s.nextInt();
                // taking data for every children one by one
                for (int i = 0; i < childNumber; i++) {
                    System.out.println("Enter the " + i + "the child of" + frontNode.data);
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
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
    }
}
