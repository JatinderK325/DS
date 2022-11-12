package ObjectOrientedProgramming.Recursion;

public class PrintKeypadCombinations {
    public static void keypad(int n, String outputSoFar) {
        if (n == 0) {
            System.out.println(outputSoFar);
            return;
        }
        int newN = n % 10;
        String helpans = helper(newN);
        
        keypad(n/10, outputSoFar + helpans.charAt(0));
       
        keypad(n/10, outputSoFar + helpans.charAt(1));
        
        keypad(n/10, outputSoFar + helpans.charAt(2));
        
    }

    private static String helper(int newN) {
        if (newN == 2)
            return "abc";
        if (newN == 3)
            return "def";
        if (newN == 4)
            return "ghi";
        if (newN == 5)
            return "jkl";
        if (newN == 6)
            return "mno";
        if (newN == 7)
            return "pqrs";
        if (newN == 8)
            return "tuv";
        if (newN == 9)
            return "wxyz";
        else
            return "";
    }

    public static void keypad(int input){
        keypad(input, "");
    }
    public static void main(String[] args) {
        keypad(234);
    }
}
