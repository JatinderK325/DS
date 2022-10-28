package ObjectOrientedProgramming.Recursion;

import java.util.Scanner;

public class XToThePowerN {
    public static int power(int n, int x){
        if(x==0){
            return 1;
          }
            if(x==1){
            return n;
          }
          int mult=power(n,x-1);
          return n*mult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter a power");
        int x = sc.nextInt();
        int ans = power(n, x);
        System.out.println(ans);
    }
}
