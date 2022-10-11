package Arrays;
// sorting in ascending order:
public class SelectionSort {
    public static void sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int indexOfMin = i;
            for (int j = i + 1; j < array.length; j++) { // j = i + 1 becoz we are sorting rest of the array with not included index = 0.
                if(array[j] < min){
                    min = array[j];
                    indexOfMin = j;
                }
            }
            if(indexOfMin != i){
                array[indexOfMin] = array[i];
                array[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        int input[] = { 2, 6, 9, 1, 15 };
        sort(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        
    }
}
