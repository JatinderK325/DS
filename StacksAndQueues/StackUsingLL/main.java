package StacksAndQueues.StackUsingLL;

public class main {
    public static void main(String[] args) throws StackFullException {
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        System.out.println(stack.isEmpty());
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (Exception e) {
                 e.printStackTrace();
            }
        }
    }
}
