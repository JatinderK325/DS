package functions;

import java.util.Scanner;

public class TempConversion {

    public static void convertTemp(int startValue, int endValue, int gapValue){
        while (startValue <= endValue) {
            int SInCelcius = ((5 * (startValue - 32)) / 9);
            System.out.println(startValue + "\t" + SInCelcius);
            startValue = startValue + gapValue;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a Start Fahrenheit Value");
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        System.out.println("Enter a End Fahrenheit Value");
        int E = s.nextInt();
        System.out.println("Enter a Step Size");
        int W = s.nextInt();
        convertTemp(S, E, W);

    }

}
