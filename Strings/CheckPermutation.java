package Strings;

import java.util.*;

public class CheckPermutation {
    public static boolean check(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < str1.length(); i++) {
            if(ch1[i]!=ch2[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter strings s1 and s2");
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        boolean answer = check(s1, s2);
        System.out.println(answer);
    }
}
