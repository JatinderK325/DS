package ObjectOrientedProgramming.Recursion;

public class Multiplication {
    private static int multiplication(int a, int b){
        if(b == 1){
            return a;
        }
        if(b == 0){
            return 0;
        }
        return a + multiplication(a, b-1);
        
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println(multiplication(a, b));
    }
}
