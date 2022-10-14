package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "abcdefgh"; // string is like a character array. 
        System.out.println(str.charAt(1)); // like in array we access element from a particular index arr[1].
        // System.out.println(str[1]); // incorrect to access element from this particular index.
        System.out.println(str.length());
        System.out.println(str.substring(1, 6)); // endIndex does not include
        System.out.println(str.substring(1));
        System.out.println(str.substring(0)); // = System.out.println(str);
        System.out.println(str.substring(8)); // will show empty becoz there is nothing after index 8 in a string.
        System.out.println(str.contains("abc"));
    }
}
