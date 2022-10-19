package Strings;

public class ReverseStringWordWise {
    public static String reverseString(String s) {
        int end = s.length(); // 23
        int i = s.length() - 1; // 22
        String ans = "";
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                ans = ans + s.substring(i + 1, end) + " ";
                end = i;
            }
            i--;
        }
        ans += s.substring(i + 1, end);
        return ans;
    }

    public static void main(String[] args) {
        String str = "This is a sample string";
        String revStr = reverseString(str);
        System.out.println(revStr);
    }
}
