package Strings;

public class ReverseEachWord {
    public static String reverseString(String input) {
        String output = "";
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                index = i + 1;
                output += input.charAt(i);

            } else {
                output = output.substring(0, index) + input.charAt(i) + output.substring(index);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String str = "This is a sample string";
        String ans = reverseString(str);
        System.out.println(ans);
    }
}
