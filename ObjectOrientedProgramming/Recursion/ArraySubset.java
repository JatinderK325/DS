package ObjectOrientedProgramming.Recursion;

public class ArraySubset {
    public static void printSubset(int arr[], int start, int output[]) {
        if (start == arr.length) {
            for (int i : output) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        printSubset(arr, start + 1, output);

        int newoutput[] = new int[output.length + 1];
        int j = 0;
        for (; j < output.length; j++) {
            newoutput[j] = output[j];
        }
        newoutput[j] = arr[start];
        printSubset(arr, start + 1, newoutput);
    }

    public static void main(String[] args) {
        int arr[] = { 15, 20, 12 };
        int output[] = new int[0];
        int start = 0;
        printSubset(arr, start, output);
    }
}
