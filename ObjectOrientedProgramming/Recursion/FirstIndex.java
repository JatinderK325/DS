package ObjectOrientedProgramming.Recursion;

public class FirstIndex {
    private static int firstOccurenceOfx(int input[], int startIndex, int x){
        if(startIndex == input.length ){
            return -1;
        }

        if(x == input[startIndex]){
            return startIndex;
        }

        int ans = firstOccurenceOfx(input, startIndex+1, x);
        return ans;
    }

    public static int firstOccurenceOfx(int input[], int x){
        return firstOccurenceOfx(input , 0, x);
    }
    public static void main(String[] args) {
        int input[] = {9, 8, 10, 8};
        int x = 8;
        System.out.println(firstOccurenceOfx(input, x));
    }
}
