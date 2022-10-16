package Arrays;
// incomplete
public class SumOfTwoArrays {
    public static int[] add(int arr1[], int arr2[]){
        int i = 0;
        int j = 0;
        int k = 0;
        int ans[] = new int[arr1.length + 1];
        while (i < arr1.length && j < arr2.length) {
            ans[k+1] = arr1[i] + arr2[j];
            //if(ans[k+1]){

           // }
            i++;
            j++;
            k++;
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr1[] = {6,2,4};
        int arr2[] = {7,5,6};
        int ans[] = add(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
