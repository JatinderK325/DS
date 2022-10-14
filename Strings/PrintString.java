package Strings;

public class PrintString {
    public static void printStr(String s){
        // printing each character of a string
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        // if printing string
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "Jatinder";
        printStr(str);
    }
}