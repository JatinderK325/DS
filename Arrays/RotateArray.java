package Arrays;

public class RotateArray {
    public static void rotate(int array[]){
        int d = 2;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = array[i];
        }
        for (int i = d; i < array.length; i++) {
            array[i-d] = array[i];
        }
        // Copying the temp array elements in original array
        for (int i = 0; i < d; i++) {
            array[i + array.length - d] = temp[i]; // first time array[i + array.length - d] = array[5] thus array[5] = temp[0] i.e 1
        }
    }
    public static void main(String[] args) {
        int array[] = { 1,2,3,4,5,6,7};
        rotate(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
