package Strings;

public class Palindrome {
    public static boolean isPalindrome(String s){
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
 
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (s.equals(rev)) {
            ans = true;
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "abcba";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);
    }
}
