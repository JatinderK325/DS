package ObjectOrientedProgramming.Recursion;

public class SumOfNaturalNumbers {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int smallAns = sum(n-1);
        return n + smallAns;
    }
    public static void main(String[] args) {
        int n = 4;
        int ans = sum(n);
        System.out.println(ans);
    }
}
