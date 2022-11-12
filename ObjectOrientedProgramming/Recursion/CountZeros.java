package ObjectOrientedProgramming.Recursion;

import java.util.Scanner;

public class CountZeros {
    public static int zerosInNumber(int n){
        if (n <= 0) {
            return 0;
        }
        int smallAns = zerosInNumber(n/10);
        if(n % 10 == 0){
            smallAns = 1 + smallAns;
        }
        return smallAns;
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int ans = zerosInNumber(n);
        System.out.println(ans);
    }
}
