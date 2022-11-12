package ObjectOrientedProgramming.Recursion;

public class RemoveDuplicates {
    public static String removeDuplicate(String str){
        if(str.length() == 1){
            return str;
        }

        String ans = "";
        if(str.charAt(0) != str.charAt(1)){
            ans = ans + str.charAt(0);
        }
        String smallAns = removeDuplicate(str.substring(1));

        return ans + smallAns;
        
    }
    public static void main(String[] args) {
        String str = "xxxyyyzwwzzz";
        System.out.println(removeDuplicate(str));
    }
}
