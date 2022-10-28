package ObjectOrientedProgramming.Recursion;

import java.util.Scanner;

public class NumberOfDigits {
    public static int digitsInANumber(int n, int count){
        // if n = 156 , output shd be 3.
        if(n==0){
            return count;
        }
            
          return digitsInANumber(n/10, count+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int ans = digitsInANumber(n, 0);
        System.out.println(ans);
    }
}
