package Strings;

// import java.util.StringTokenizer;

public class CountWords {
    public static int countWords(String s){
        String words[] = s.split("\\s+");
        return words.length;
        // StringTokenizer tokens = new StringTokenizer(s);
        // return tokens.countTokens;
    }
    public static void main(String[] args) {
        String str = "This is a sample string";
        int count = countWords(str);
        System.out.println(count);
    }
}
