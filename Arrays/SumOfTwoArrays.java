package Arrays;

public class SumOfTwoArrays {
    public static int[] add(int arr1[], int arr2[]){
        int na = arr1.length;
        int nb = arr2.length;
        int nc;
        int min;

        if(na > nb){
            nc = na + 1;
            min = nb;
        }else{
            nc = nb + 1;
            min = na;
        }

        int c[] = new int[nc];
        int sum = 0;
        int carry = 0;
        int i = na - 1;
        int j = nb - 1;
        int k = nc - 1;

        while(i >= 0 && j>=0){
            sum  = arr1[i] + arr2[j] + carry;
            i--;
            j--;
            c[k] = sum % 10;
            sum = sum / 10;
            carry = sum % 10;
            k--;        
        }//end of while loop

        while(i >= 0){          //n2 has exhausted
            sum  = arr1[i] + carry;
            c[k] = sum % 10;
            sum = sum / 10;
            carry = sum % 10;
            i--;
            k--;
        }

        while(j >= 0){        //n1 has exhausted  
            sum  = arr2[j] + carry;
            c[k] = sum % 10;
            sum = sum / 10;
            carry = sum % 10;
            k--;        
            j--;
        }

        c[k] = carry;

        return c;

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
