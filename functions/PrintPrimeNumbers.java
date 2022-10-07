package functions;

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static String checkPrime(int num){
        for(int divisor = 2; divisor < num; divisor++){
            int ans = num % divisor;
            if(ans == 0){
                return "Not prime";
            }
        }
        return "Prime";
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = checkPrime(n);
        System.out.println(str);

    }
}
