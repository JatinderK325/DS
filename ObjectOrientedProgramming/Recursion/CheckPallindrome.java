package ObjectOrientedProgramming.Recursion;

public class CheckPallindrome {
    public static boolean pallindrome(String s) {

        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return pallindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "abcba";
        boolean ans = pallindrome(str);
        System.out.println(ans);
    }
}
