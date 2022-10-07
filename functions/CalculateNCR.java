package functions;
import java.util.*;

public class CalculateNCR{

    public static int factorial(int num){
        int ans = 1;
        for(int i = 1; i <= num; i++){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        int numenator = factorial(n);
        int denominator1 = factorial(r);
        int denominator2 = factorial(n-r);
        int answer = numenator/denominator1 * denominator2;
        System.out.println(answer);

    }
}