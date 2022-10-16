package Arrays;

public class CheckArrayRotation {
    public static int checkRotation(int array[]){
      int size = array.length;
      int max = Integer.MIN_VALUE;
      int index = 0;
      int count = 0;
      for (int i = 0; i < size; i++){
        if(array[i] > max){
            max = array[i];
            index = i;
        }
      }
      for (int i = 0; i <= index && index != size-1; i++) {
            count++;
      }
      return count;
    }
    // for(int i=0;i<array.length-1;i++)
    //     {
    //         if(array[i]>array[i+1])
    //             return i+1;
    //     }
    //     return 0;
    // }
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 1};
        int largest = checkRotation(array);
        System.out.println(largest);
} 
}
