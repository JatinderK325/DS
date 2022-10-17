package TwoDArrays;

public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = new int[4][];
        for (int i = 0; i < arr.length; i++) {
             arr[i] = new int[i+2];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
