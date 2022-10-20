package Strings;

import java.util.*;

public class RemoveConsecutive {
    public static String check(String str) {
        String ans = " ";
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if (temp != (int) str.charAt(i)) {
                ans += str.charAt(i);
            }
            temp = (int) str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string");
        String s1 = s.nextLine();
        String answer = check(s1);
        System.out.println(answer);
    }
}
