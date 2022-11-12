package ObjectOrientedProgramming.Recursion;

public class StringToInteger {
    public static int convert(String str) {

        if (str.length() == 1){
            return str.charAt(0) - '0';
        }
        int ans = convert(str.substring(1));
        int x = str.charAt(0) - '0';
        x = x * (int) Math.pow(10, str.length() - 1) + ans;
        return x;
    }

    public static void main(String[] args) {
        String str = "12345";
        int ans = convert(str);
        System.out.println(ans);
    }
}
