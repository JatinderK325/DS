package Arrays;

public class BubbleSort {
    // bubble sort in ASC
    public static void bubbleSort(int array[]){
        for (int i = 0; i < array.length - 1; i++) { // counter of rounds
            for (int j = 0; j < array.length - i - 1; j++) {// array transversing
                if (array[j] > array[j+1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {8,2,6,1,5};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
