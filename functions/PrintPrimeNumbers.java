package functions;

import java.util.Scanner;

public class PrintPrimeNumbers {

    public static boolean checkPrime(int num){
        for(int divisor = 2; divisor < num; divisor++){
            int ans = num % divisor;
            if(ans == 0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int num){
        for(int i = 2; i <= num; i++){
            // need to check i is prime or not
            boolean isPrime = checkPrime(i);
            if(isPrime){
                System.out.println(i);
            }
 
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printPrime(n);

    }
}
