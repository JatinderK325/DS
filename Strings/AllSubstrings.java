package Strings;

public class AllSubstrings {
    public static void printSubstrings(String s){
        // i+1 becoz endIndex does not include.
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }   
        }
    }
    public static void main(String[] args) {
        String str = "xyz";
        printSubstrings(str);   
    }
}
