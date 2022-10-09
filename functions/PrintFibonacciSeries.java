package functions;

import java.util.Scanner;

public class PrintFibonacciSeries {

    public static void printFibonacciSeries(int num) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+ " " +b);
        for (int i = 1; i <= num; i++) {
            c = a + b;
            System.out.print(" " +c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printFibonacciSeries(n);
    }
}
