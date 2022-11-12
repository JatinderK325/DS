package ObjectOrientedProgramming.Recursion;

public class ReplaceCharacter {
    public static String replaceChar(String str, char c1, char c2) {
        if (str.length() == 0) {
            return str;
        }
        String newStr = "";
        if (str.charAt(0) == c1) {
            String smallAns = replaceChar(str.substring(1), c1, c2);
            newStr = newStr + c2 + smallAns ;
            return newStr;
        }
        else{
            String smallAns = replaceChar(str.substring(1), c1, c2);
            return str.charAt(0) + smallAns;
        }
    }

    public static void main(String[] args) {
        String str = "abacdfa";
        char toReplace = 'a';
        char replaceBy = 'x';
        String ans = replaceChar(str, toReplace, replaceBy);
        System.out.println(ans);
    }
}
