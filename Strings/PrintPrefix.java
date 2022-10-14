package Strings;

public class PrintPrefix {
    public static void printPrefix(String s){
        // i+1 becoz endIndex does not include.
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(0, i+1));
        }
    }
    public static void main(String[] args) {
        String str = "abcde";
        printPrefix(str);
    }
}
