package ObjectOrientedProgramming.Recursion;

public class SumOfDigits {
    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }

        int smallAns = n%10 + sumOfDigits(n/10);
        return smallAns ;
    }
    public static void main(String[] args) {
        int number =  123451;
        int ans = sumOfDigits(number);
        System.out.println(ans);
    }
}
