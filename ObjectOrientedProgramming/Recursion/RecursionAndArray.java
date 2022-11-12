package ObjectOrientedProgramming.Recursion;

public class RecursionAndArray {
    public static boolean checkSorted(int input[]){
        if(input.length <= 1){
            return true;
        }
        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }

        boolean smallAns = checkSorted(smallInput);
        if(!smallAns){
            return false;
        }
        if(input[0] <= input[1]){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkSortedAlternative(int input[]){
        if(input.length <= 1){
            return true;
        }
        if(input[0] > input[1]){
            return false;
        }
        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }
        boolean smallAns = checkSortedAlternative(smallInput);
        if(smallAns){
            return true;
        }
        else{
            return false;
        }
    }
 // This function checks if the array is sorted from startIndex to end.
        public static boolean checkSortedBetter(int input[], int startIndex) {
            if (startIndex >= input.length - 1) { // 1
                return true;
            }
            if(input[startIndex] > input[startIndex + 1]){ // 2
                return false;
            }
            
            boolean ans = checkSortedBetter(input, startIndex+1); // processing
            return ans;
        }

    public static void main(String[] args) {
        int input[] = {2,1,3,6,9};
        // System.out.println(checkSortedAlternative(input));
        System.out.println(checkSortedBetter(input, 0));
    }
}
