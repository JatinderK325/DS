package ObjectOrientedProgramming.Recursion;

public class ReplacePI {
    public static String replace(String s){
       // Base case if s is empty
        // or length of s is 1
        // return the s
        if (s.length() == 0 || s.length() == 1){
            return s;
        }
 
        // If the 0th and 1st element
        // of s are p and i we have to
        // handle them for rest we have
        // to call recursion it will
        // give the result
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
 
            // Smalloutput is a variable
            // used to store recursion result
            String smallOutput = replace(s.substring(2));
 
            // And we have to add the recursion
            // result with the first part we
            // handled and return the answer
            return "3.14" + smallOutput;
        }
        else {
 
            // If not then we have to call
            // recursion from 1st to all elements
            // then add recursion result to
            // 1st element and return it
            String smallOutput = replace(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        String str = "xxpi";
        String ans = replace(str);
        System.out.println(ans);
    }
}
