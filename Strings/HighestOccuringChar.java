package Strings;

public class HighestOccuringChar {
    public static char highestOccurance(String inputString) {
        int freq[] = new int[256];

        for (int i = 0; i < inputString.length(); i++) {
            int ch = inputString.charAt(i);
            freq[ch] = freq[ch] + 1;
        }

        int largest = 0;
        char indexToChar = inputString.charAt(0);
        for (int i = 0; i < inputString.length(); i++) {
            int index = inputString.charAt(i);
            if (freq[index] > largest) {
                indexToChar = inputString.charAt(i);
                largest = freq[index];
            }
        }
        return indexToChar;
    }

    public static void main(String[] args) {
        String str = "abdefgbabfba";
        char ch = highestOccurance(str);
        System.out.println(ch);
    }
}
