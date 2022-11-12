package ObjectOrientedProgramming.Recursion;

public class CheckNumber {
    static boolean check(int input[], int x, int startIndex) {
        if (startIndex == input.length) { // 1
            return false;
        }
        if(x == input[startIndex]){ // 2
            return true;
        }
        
        boolean ans = check(input, x, startIndex+1); // processing
        return ans;
    }
    public static void main(String[] args) {
        int input[] = {-1,2,3};
        int x = -1;
        System.out.println(check(input, x, 0));
    }
}
