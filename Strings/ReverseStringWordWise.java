package Strings;
// incomplete
public class ReverseStringWordWise {
    public static String reverseString(String s){
        //String words[] = s.split("\\s+");
        // return words.length;
        String revStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revStr = revStr + i;
        }
        return revStr;
    }
    public static void main(String[] args) {
        String str = "This is a sample string";
        String revStr = reverseString(str);
        System.out.println(revStr);
    }
}
