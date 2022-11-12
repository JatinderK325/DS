package ObjectOrientedProgramming.Recursion;

public class PairStar {
    public static String pairStar(String s) {
        String str = "";
        if (s.length() == 1) {
            return s;
        }
        String smallAns = pairStar(s.substring(1));
        if (s.charAt(0) == s.charAt(1)) {
            str = s.charAt(0) + "*" + smallAns;
            return str;
        } 
        else {
            str = s.charAt(0) + smallAns;
            return str;
        }
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(pairStar(s));
    }
}
