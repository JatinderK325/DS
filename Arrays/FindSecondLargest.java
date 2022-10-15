package Arrays;

public class FindSecondLargest {
    public static int findSecondLargest(int arr[]) {
        if (arr.length <= 1){
            return -2147483648;
        };
        // to check all the elements are same in the array/list.
        int issame = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == issame)
                count++;
        }
        if (count == arr.length)
            return -2147483648;

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest)
                continue;
            if (arr[i] > secondLargest)
                secondLargest = arr[i];
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int array[] = { 9, 3, 6, 2, 9 };
        int secondLargest = findSecondLargest(array);
        System.out.println(secondLargest);
    }
}
