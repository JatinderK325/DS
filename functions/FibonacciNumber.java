package functions;
// incomplete
import java.util.Scanner;

public class FibonacciNumber {
    public static boolean checkMember(int num) {

        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int a = 0;
        int b = 1;
        int c;
        if (num == 0) {
            return true;
        }
        
        while ((a + b) <= num) {   
            c = a + b;
            a = b;
            b = c;
            
            if (num == c) {
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean ans = checkMember(n);
        System.out.println(ans);
    }

}
