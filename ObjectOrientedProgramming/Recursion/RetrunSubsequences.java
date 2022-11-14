package ObjectOrientedProgramming.Recursion;

public class RetrunSubsequences {
    public static String[] findSubsequences(String str){
        if(str.length() == 0){
            String ans[] = {""};
            return ans;
        }

        // getting subsequences of yz(small problem).
        String smallAns[] = findSubsequences(str.substring(1));
        String ans[] = new String[2 * smallAns.length];
  
        // copying smallAns to ans as it is.. : "", z, yz, y
        for (int i = 0; i < smallAns.length; i++) {
            // ans[i] = 0, 1, 2, 3
            ans[i] = smallAns[i];
        }

        // copying smallAns to ans with first character : "x", xz, xyz, xy
        for (int i = 0; i < smallAns.length; i++) {
            // ans[i + smallAns.length] = 4, 5, 6, 7, becoz 0 to 3 indices are filled with  "", z, yz, y. now copying rest with "x", xz, xyz, xy
            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "xyz";
        String ans[] = findSubsequences(str);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
