package ObjectOrientedProgramming.Recursion;

public class PrintSubsequences {
    public static void printSubsequence(String input, String outputSoFar){
        if(input.length() == 0){
            System.out.println(outputSoFar);
            return;
        }
        // we choose not to include the first character
        printSubsequence(input.substring(1), outputSoFar);
        // we choose to include the first character
        printSubsequence(input.substring(1), outputSoFar + input.charAt(0));

    }
    public static void printSubsequence(String input){
        printSubsequence(input, "");
    }
    public static void main(String[] args) {
        printSubsequence("xyz");
    }
}
