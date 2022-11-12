package ObjectOrientedProgramming.Recursion;

public class SumOfArray {
    static int sum(int input[], int n) {
        if (n == 0) { // 1
            return 0;
        }
        int sum = 0;
        int ans = sum + input[--n];
        int output = ans + sum(input, n);
        return output;
    }
    public static void main(String[] args) {
        int input[] = {1,12,3};
        int n = input.length;
        System.out.println(sum(input, n));
    }
}
