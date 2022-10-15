package Arrays;

public class PushZerosToEnd {
    public static void push(int array[]){
        // bubble sort
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] == 0) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {9, 0, 0, 8, 2};
        push(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
