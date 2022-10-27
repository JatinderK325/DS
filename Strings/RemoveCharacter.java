package Strings;

public class RemoveCharacter {
    public static String removeCh(String s) {
        String str = "";
        char ch = 'o';
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if(ch == t){
                continue;
            }
            else{
                str = str+t+"";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "Welcome to coding ninjas";
        String newStr = removeCh(str);
        System.out.println(newStr);
}
}

