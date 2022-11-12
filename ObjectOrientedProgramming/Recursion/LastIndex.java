package ObjectOrientedProgramming.Recursion;

public class LastIndex {
    public static int lastOccurenceOfx(int input[], int startIndex, int x){
        if(startIndex < 0 ){
            return -1;
        }

        if(x == input[startIndex]){
            return startIndex;
        }

        int ans = lastOccurenceOfx(input, startIndex-1, x);
        return ans;
    }

    public static void main(String[] args) {
        int input[] = {9, 8, 10, 8, 12};
        int x = 8;
        System.out.println(lastOccurenceOfx(input, input.length-1, x));
    }
}
